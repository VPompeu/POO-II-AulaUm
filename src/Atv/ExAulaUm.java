package Atv;
import javax.swing.JOptionPane;

public class ExAulaUm 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// ATV 1
		System.out.println("Meu super programa!");
		
		// ATV 2
		String primeiro = "Meu super programa";
		
		JOptionPane.showMessageDialog(null, primeiro);
		
		// ATV 3
		String nome = "";
		String idade = "";
		String telefone = "";
		
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
		idade = JOptionPane.showInputDialog("Qual sua idade?");
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
		telefone = JOptionPane.showInputDialog("Qual seu telefone?");
		JOptionPane.showMessageDialog(null, "Seu telefone é: " + telefone);
		
		// ATV 4
		String email = "";
		
		email = JOptionPane.showInputDialog("Qual seu e-mail?");
		JOptionPane.showMessageDialog(null, "Seu e-mail é: " + email);
		
		// ATV 5
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu telefone: " + telefone);
		System.out.println("Seu e-mail: " + email);
		
		// ATV 6
		int linhas = 8;
		int colunas = 30;

		// Faz a primeira linha de A
		for (int i = 0; i < colunas; i++) 
		{
		    System.out.print("A");
		}
		System.out.println(); // Alinha a linha inicial e final com a coluna inicial e final

		// Faz a primeira coluna de A
		for (int i = 0; i < linhas - 2; i++) 
		{
			System.out.print("A");
			
			//Elimina o preenchimento do retângulo
		    for (int j = 0; j < colunas - 2; j++) 
		    {
		        System.out.print(" ");
		    }
		    System.out.println("A"); // Adiciona a última coluna
		}

		// Faz a última linha
		for (int i = 0; i < colunas; i++) 
		{
		    System.out.print("A");
		}
		System.out.println();
	}

}
