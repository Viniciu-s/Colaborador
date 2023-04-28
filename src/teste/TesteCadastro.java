package teste;

import java.util.Calendar;

import colaborador.Colaborador;
import dao.ColaboradorDAO;

public class TesteCadastro {
    public static void main(String[] args) {
        // Instancia o DAO
        ColaboradorDAO dao = new ColaboradorDAO();

        // Instancia o Colaborador
        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Vinicius Vieira");
        colaborador.setEmail("vinicius@fiap.com.br");
        colaborador.setSalario(6200);
        colaborador.setDataContratacao(Calendar.getInstance());

        // Cadastra no banco de dados
        dao.cadastrar(colaborador);

        System.out.println("Cadastrado!");
    }
}
