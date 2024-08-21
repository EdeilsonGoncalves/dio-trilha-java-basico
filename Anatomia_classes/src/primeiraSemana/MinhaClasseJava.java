package primeiraSemana;
public class MinhaClasseJava {

public static void main (String [] args) {
	
	System.out.println("Olá turma, sejam bem vindos.");
		//String meuNome = "Edeilson";
		//int anoFabricacao = 2022;
		//boolean verdadeira = false;
		//anoFabricacao = 2018;
		String primeiroNome = "Edeilson";
		String segundoNome = "Gonçalves";
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		//todo método tem parâmetro
		System.out.println(nomeCompleto);
}
	
public static String nomeCompleto (String primeiroNome, String segundoNome)	{
	return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
			
}


}

// Nome da classe é o mesmo nome do arquivo.
// final define uma variável que não pode ser alterada.


//Variável em Java: 
// Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)


// Exemplo:
// int idade = 23;
// double altura = 1.62;
// Dog spike; não tem valor 

//Métodos:
// TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
//Exemplo
//int somar (int numeroUm, int numero2)






