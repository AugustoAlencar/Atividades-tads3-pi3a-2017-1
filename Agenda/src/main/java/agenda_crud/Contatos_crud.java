/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_crud;

import conection.ConnectionDB;
import java.awt.Dimension;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.management.RuntimeErrorException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import servicesAgenda.Agenda;

public class Contatos_crud {

    ConnectionDB con = new ConnectionDB();

    public void cadastrarContatos(Agenda agenda) {
        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());        
        con.Connection();
        try {
            PreparedStatement pst = con.con.prepareStatement("INSERT INTO usuarios (nome,data_Nasc, "
                    + "telefone,email,sexo,data_Cad) VALUES(?,?,?,?,?,?)");

            pst.setString(1, agenda.getNome());
            pst.setString(2, agenda.getDataNasc());
            pst.setString(3, agenda.getTelefone());
            pst.setString(4, agenda.getEmail());
            pst.setString(5, agenda.getSexo());            
            pst.setTimestamp(6, dataDeHoje);            
            pst.execute();

            JOptionPane.showMessageDialog(null, " Dados Salvos com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao Salvar!\n " + ex);
            return;
        }
        con.closeConnection();
    }

    public List<Agenda> retornarContatos() throws SQLException {

        List<Agenda> agendaContatos = new ArrayList<>();

        try {
            con.Connection();

            PreparedStatement stmt = con.con.prepareStatement("select * from usuarios");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agenda agenda = new Agenda();
                agenda.setId(rs.getInt("id"));
                agenda.setNome(rs.getString("nome"));
                agenda.setDataNasc(rs.getString("data_Nasc"));
                agenda.setTelefone(rs.getString("telefone"));
                agenda.setEmail(rs.getString("email"));
                agenda.setSexo(rs.getString("sexo"));
                agendaContatos.add(agenda);
            }
            rs.close();
            stmt.close();
        } catch (Error e) {
            throw new RuntimeErrorException(e);
        }
        return agendaContatos;
    }

    public List<Agenda> retornarContatosNome(String nome) throws SQLException {

        List<Agenda> agendaContatos = new ArrayList<>();

        try {
            con.Connection();

            PreparedStatement stmt = con.con.prepareStatement("select * from usuarios");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agenda agenda = new Agenda();
                agenda.setId(rs.getInt("id"));
                agenda.setNome(rs.getString("nome"));
                agenda.setDataNasc(rs.getString("data_Nasc"));
                agenda.setTelefone(rs.getString("telefone"));
                agenda.setEmail(rs.getString("email"));
                agenda.setSexo(rs.getString("sexo"));
                agendaContatos.add(agenda);
            }
            rs.close();
            stmt.close();
        } catch (Error e) {
            throw new RuntimeErrorException(e);
        }
        return agendaContatos;
    }

    
    public Agenda Atualizar(Agenda agenda, int id) {
        con.Connection();
        try {

            PreparedStatement pst = con.con.prepareStatement("select * from usuarios where id = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Contato atualizado");
                agenda.setNome(rs.getString("nome"));
                agenda.setDataNasc(rs.getString("data_Nasc"));
                agenda.setTelefone(rs.getString("telefone"));
                agenda.setEmail(rs.getString("email"));
                agenda.setSexo(rs.getString("sexo"));
                pst.execute();

            } else {
                JOptionPane.showMessageDialog(null, "Contato não encontrado. \nCodigo invalido");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Contato não encontrado" + ex);
        }
        con.closeConnection();
        return agenda;
    }

    public void UpdateContatos(Agenda agenda, int id) {
        con.Connection();
        try {

            PreparedStatement pst = con.con.prepareStatement("update usuarios set nome=? , data_Nasc=?, telefone=?"
                    + " , email=? , sexo=?, id=?");

            pst.setString(1, agenda.getNome());
            pst.setString(2, agenda.getDataNasc());
            pst.setString(3, agenda.getTelefone());
            pst.setString(4, agenda.getEmail());
            pst.setString(5, agenda.getSexo());            
            pst.execute();

            JOptionPane.showMessageDialog(null, " Dados Salvos com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao Salvar!\n " + ex);
        }
        con.closeConnection();
    }

    public void excluirUsuario(Agenda agenda) throws SQLException, Exception {
        con.Connection();
        try {
            PreparedStatement pst = con.con.prepareStatement("delete from usuarios where id=?");
            pst.setInt(1, agenda.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Contato excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato! \n" + ex);
        }
        con.closeConnection();

    }

    public void procurarNome(JTable tabela, String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        Contatos_crud contatos = new Contatos_crud();
        boolean flag = true;

        for (Agenda agenda : contatos.retornarContatosNome(nome)) {

            if (agenda.getNome().equalsIgnoreCase(nome)) {
                modelo.addRow(new Object[]{
                    agenda.getId(),
                    agenda.getNome(),
                    agenda.getDataNasc(),
                    agenda.getTelefone(),
                    agenda.getEmail(),
                    agenda.getSexo(),
                    agenda.getDataCad()});
                flag = false;
                break;
            }

        }
        if (flag) {
            JOptionPane.showMessageDialog(null, "Nome não encontrado");
        }

    }

    public void preencherTabela(JTable tabela) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        Contatos_crud contatos = new Contatos_crud();

        for (Agenda agenda : contatos.retornarContatos()) {
            modelo.addRow(new Object[]{
                agenda.getId(),
                agenda.getNome(),
                agenda.getDataNasc(),
                agenda.getTelefone(),
                agenda.getEmail(),
                agenda.getSexo(),
                agenda.getDataCad()});

        }
    }


}

