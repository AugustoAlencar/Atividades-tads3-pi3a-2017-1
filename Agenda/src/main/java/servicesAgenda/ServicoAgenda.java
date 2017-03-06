package servicesAgenda;

import exceptions.DataSourceException;
import agenda_crud.Contatos_crud;
import exceptions.AgendaException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe de serviço da Agenda *
 */
public class ServicoAgenda {

    Agenda agenda = new Agenda();
    Contatos_crud contato = new Contatos_crud();

    //Insere um Agenda na fonte de dados
    public static void cadastrarAgenda(Agenda agenda)
            throws AgendaException, DataSourceException {

        //Realização de validações de negócio
        if (agenda == null) {
            throw new AgendaException("Agenda vazia");
        }
        if (agenda.getNome() == null || "".equals(agenda.getNome())) {
            throw new AgendaException("É necessário informar o nome");
        }
        if (agenda.getDataNasc() == null || "".equals(agenda.getDataNasc())) {
            throw new AgendaException("É necessário informar a data de nascimento");
        }
        if (agenda.getEmail() == null || "".equals(agenda.getEmail())) {
            throw new AgendaException("É necessário informar o email");
        }
        if (agenda.getTelefone() == null || "".equals(agenda.getTelefone())) {
            throw new AgendaException("É necessário informar o telefone");
        }

        if (agenda.getSexo() == null || agenda.getSexo().equals("Selecione:")) {
            throw new AgendaException("O sexo precisa ser informado");
        }

        try {
            //Realiza a chamada de inserção na fonte de dados
            Contatos_crud contato = new Contatos_crud();
            contato.cadastrarContatos(agenda);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
