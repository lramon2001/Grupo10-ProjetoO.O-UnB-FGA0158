/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo10.estacionamento.app;

import com.grupo10.estacionamento.classes.CadastroVeiculos;
import com.grupo10.estacionamento.classes.Veiculo;
import com.grupo10.estacionamento.classes.VeiculoMensalista;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas 
 */
public class Main {

    
   static CadastroVeiculos veiculos =new CadastroVeiculos(); 
     
     
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
 
        int x;
        do{
            
            String menu="Digite\n"+
                "1-Cadastrar veículo rotativo;\n"+
                "2-Cadastrar veiculo mensalista;\n"+
                "3-Registrar acesso de usuário rotativo;\n"+
                "4-Registrar acesso de usuário mensalista;\n"+
                "5-Exibir veiculos cadastrados;\n"+
                "6-Exibir proprietarios;\n"+
                "7-Exibir listas de acessos;\n"+
                "8-Exibir faturamento\n";
            String strx=JOptionPane.showInputDialog(null, menu);
            x=Integer.parseInt(strx);
            String m1="Funcionalidade não implementada";
            switch (x) {
                case 1:
                    /*
                    Criando um novo registro de veiculo.
                    1-Instanciar um novo veiculo;
                    2-Setar todos os atributos do veiculo;
                    3-Se o carro já estiver registrado, lançar a exception veiculo já cadastrado;
                    4-Enviar uma mensagem de sucesso,caso seja bem sucedido.
                     */
                    Veiculo v = new Veiculo();

                    String strMarca = JOptionPane.showInputDialog("Digte a marca do veículo:");
                    v.setMarca(strMarca);

                    String strModelo = JOptionPane.showInputDialog("Digte o modelo do veículo:");
                    v.setModelo(strModelo);

                    String strPlaca = JOptionPane.showInputDialog("Digte a placa do veículo:");
                    v.setNumeroPlaca(strPlaca);
                     
                    if(veiculos.buscar(strPlaca)==null){
                         veiculos.cadastrarRotativo(v);
                    }
                   
                     
                    break;
                case 2:
                    
                    JOptionPane.showMessageDialog(null, m1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, m1);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, m1);
                    break;
                case 5:
                    veiculos.listar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, m1);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, m1);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, m1);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso software\n");
                    x = 0;
                    break;
            }
        } while (x != 0);
    
}
    
}
