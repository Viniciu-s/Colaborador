package teste;

import java.sql.SQLException;

import colaborador.Colaborador;
import dao.ColaboradorDAO;

public class TesteAlteracao {
    public static void main(String[] args) throws SQLException {
  
        ColaboradorDAO dao = new ColaboradorDAO();
        //Recupera o colaborador com código 1
        Colaborador colaborador = dao.buscarPorId(24);
        if (colaborador != null) { // Verifica se o objeto colaborador é nulo
            //Imprime os valores do colaborador
            System.out.println(colaborador.getCodigo() + " "
                    + colaborador.getNome() + " " + colaborador.getEmail() + " "
                    + colaborador.getSalario() + " "
                    + colaborador.getDataContratacao().getTime());
            //Altera os valores de alguns atributos do colaborador
            colaborador.setNome("Vinicius Vieira");
            colaborador.setSalario(11000);
            colaborador.setEmail("vinicius@fiap.com.br");
            //Atualiza no banco de dados
            dao.atualizar(colaborador);
        } else {
            System.out.println("Colaborador não encontrado.");
        }
    }
}