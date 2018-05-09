 CONVE��ES JAVA
Nome de classes:
	N�o pode usar acentos, espacoc e caracteres especiais (exceto _ )
	N�o podemos usar palavras reservadas
	Nome obrigatoriamente com a primeira letra mai�scula
	Usar Camel Case para mais de um nome
Nome de pacotes:
	Dom�nio ao contr�rio (ex: br.com.gff.java)

//INSTALAR DICIONARIO PT/BR
	Obter o dicionario
	Window -> Preferences -> General -> Editors -> Text editors -> Spelling
	Importar o dicionario -> Apply -> Ok
	Reiniciar

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * MANIPULA��O DE VARI�VEL 
 */

	int num1, num2;
	num1 ++; //Adiciona 1 unidade
	num1 --; //Subtrai 1 unidade
	num1 + ++num2; //Soma os 2 valores, com 1 unidade a mais no 2

	num1 += num2; //Soma e atrib�i o valor num2 em num1
	num1 -+ num2; //Subtrai e atrib�i o valor num2 em num1
	num1 *= num2; //Multiplica e atrib�i o valor num2 em num1
	num1 /= num2; //Divide e atrib�i o valor num2 em num1
	
	txtNum1.setText(Integer.toString(num1)); //Coloca no campo de texto o valor Int num1
	txtNum1.setText(Double.toString(num1)); //Coloca no campo de texto o valor double num1
	
	num1 = Integer.parseInt(txtNum1.getText()); //Pega o campo de texto e coloca na vari�vel num1
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * MANIPULA��O DE TEXTO
 */

	String frase = "Alguma coisa"; 
	System.out.println(frase); //Escreve o que estiver dentro da vari�vel
	
	Scanner teclado = new Scanner(System.in);
	String resposta = teclado.nextLine();
	int    num1 = teclado.nextInt();
	double num1 = teclado.nextDouble();
	float  num1 = teclado.nextFloat();
	char   num1 = teclado.next().charAt(0);

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA ARREDONDAMENTO DE VALORES
 */
	Math.abs(num1); // Mostra o valor absoluto (Modulo)
	Math.floor(num1); // Arredonda a [var] pra baixo
	Math.ceil(num1); // Arredonda a [var] pra cima
	Math.round(num1); // Arredonda a [var] aritmeticamente

	Math.pow(base,expoente); // Eleva a base ao expoente
	Math.sqrt(num1); // Raiz quadrada da [var]/[num]
	Math.cbrt(num1); // Raiz c�bica da [var]/[num]

	Math.sin(num1); //Seno 
	Math.cos(num1); //Cosseno 
	Math.tan(num1); //Tangente
	Math.toDegrees(angR); //Mudan�a de Radiano para Grau
	Math.toRadians(angD); //Mudan�a de Grau para Radiano
	Math.PI; //Valor de PI

	Math.max(num1,num2); //Maior valor
	Math.min(num1,num2); //Menor valor

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO SE
 */
	if(num1 < num2) { //Se num1 < num2
			//Algo acontece
	}else if(num2 < num1) { //Sen�o, se num2<num1
			//Algo acontece
	}else { //Se nenhuma das outras
		 	//Algo acontece
	}

	int num3 = num1<num2?():() //Se num1<num2, num3 recebe o 1o (), sen�o, recebe o 2o ()

			< // Maior que
> // Menor que
>= // Maior ou igual
<= // Menor ou igual
== // Igual
!= // Diferente

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO IGUALDADE DE CONTE�DO
 */
	String frase1 = "aaaaa";
	String frase2 = "AAAAA";
	
	frase1.equals(frase2); //Retorna true se ambas forem id�nticas
	frase1.equalsIgnoreCase(frase2); //Retorna true se, desconsiderando acentos e mai�sculas, forem iguais
	
	StringBuilder frase3 = newStringBuilder("BBBBB");
	frase3.append("()"); //Adiciona "()" no final da frase
	frase3.insert([num], "()"); //Adiciona "()" a partir do �ndice ()
	frase3.delete([num]); //Deleta TUDO a partir do �ndice ()

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * ESTRUTURAS DE REPETI��O
 */
	int contador = 0; // Atribui um contador e coloca valor 0
	while (contador<[num]){ //Enquanto o contador for menor do que o (n�mero), 
			//Fa�a oq quiser aqui
		contador++; // Adiciona 1 no CC
	} //[Faz o teste no in�cio]
	
	//Comando continue; interrompe o la�o e continua a repeti��o
	// Comando break; interrompe o la�o e para a repeti��o

	do{ // Fa�a algo
		// Fa�a oq quiser
		contador++;
	}while (contador<[num]); //Enquanto isso n�o acontecer
	//[Faz o teste no final]

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO ESCOLHA CASO
 */
	
	switch[var];{ // Escolha [Vari�vel]
		case ([var]): // Caso () fa�a
			//Fa�a algo
			break;
		case ([var]): // Caso () fa�a
			//Fa�a algo
			break;
		default: // Caso nenhum das outras fa�a
			//Fa�a algo
	}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 *  VETOR / MATRIZ
 */
	int vetor[] = new int [()]; // Cria um vetor com () posi��es
	int vetor[] = {(), (), ()} // Cria um vetor com os valores [(), (), ()]
		
	for(int i=0; i<vetor.length; i++){ // Para o contador indo da posi��o 0 at� a �ltima, fa�a
		System.out.println(Vetor[cont]); // Escreva o valor na posi��o cont
	}
	
	for(int [var]:vetor){ // A vari�vel recebe o valor do vetor
		System.out.println([var]);
	}
	
	vetor.length //Mostra a quantidade de casas de um vetor
	
	Array.toString(); //Transforma o Array em String
	Arrays.sort(vetor, 0, vetor.length); //Ordena alfabeticamente o vetor ([nome], [in�cio], [fim])
	Arrays.fill(Vetor ()); // Preenche o vetor com ()

	
	int [var] = Arrays.binarySearch(num, ()); // Faz uma busca bin�ria pelo ()

	String[][] vetor = [()] [()]; // Cria um vetor multidimensional [(linha)][(coluna)]
	for (int l = 0; l < vetor.length; l++) { // Para cada linhas
		for (int c = 0; c < vetor.length; c++) { // Para cada coluna
			System.out.print(vetor[l][c]); //Escreve o que est� la linha/coluna
		}
		System.out.println(); //Pula uma linha
	}

	ArrayList<String> vetor = new ArrayList<>(); //Cria um ArrayList
	vetor.add() // Adiciona um item a lista
	vetor.toString() // Mostra toda a lista
	vetor.size() // Mostra o tamanho da lista
	vetor.indexOf(()) // Procura por () na lista, responde true ou false
	vetor.remove(()) // Remove () da lista

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * CRIAR UM PROCEDIMENTO
 */
	public static void [soma](int a,int b){ // Cria um procedimento de nome []
		int [s] = a + b; // Diz oque o procedimento vai fazer
	}
	soma(5,2); // Chama o procedimento passando par�metros
	int a = 5;
	int b = 2;
	soma(a,b); // Chama o procedimento passando par�metros de vari�veis
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=


/**
 * COMANDO PARA ALTERAR A VISIBILIDADE DE ALGUM OBJETO
 */
[objeto].setVisible(true/false);
// Para come�ar um programa com algo invisivel, coloca isso no PUBLIC do codigo fonte
public.(){
init.Components;
[objeto].setVisible();
}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA PEGAR UM NUMERO DE UM CONTROLE DESLIZANTE
 */
/* Clica com direito no slider, Eventos, Change,...
* Vai criar uma classe praquele slider, l coloca
*/

[var].setText(Integer.toString([var].getValue()));

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA FATORIAL USANDO CONTROLE GIRATORIO
 */
int Numero = Integer.parseInt(txtNum.getValue().toString()); // N�mero exibido no
controle girat�rio
int fatorial = 1;
int contador = Numero;
while (contador&gt;=1){
fatorial *= contador;
contador-- ;
}
lblFatorial.setText(Integer.toString(Fatorial)); // Numero exibido como resultado

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA CRIAR UMA JANELA DE TEXTO JOPTIONPANE
 */
	import java.util.ArrayList;
import javax.swing.JOptionPane;

	JOptionPane.showMessageDialog(null, ()); // Cria janela MOSTRANDO um texto

	JOptionPane.showMessageDialog(null, (), (), // Cria uma janela MOSTRANDO um texto e um t�tulo [2o ()]
		
		JOptionPane.INFORMATION_MESSAGE); // Cria uma janela com o s�mbolo deinforma��o (!)
	JOptionPane.ERROR_MESSAGE); // Cria uma janela com s�mbolo de erro (X)
	JOptionPane.WARNING_MESSAGE); // Cria uma janela com s�mbolo de cuidado
	JOptionPane.PLAIN_MESSAGE); // Cria uma janela sem s�mbolo

	JOptionPane.showInputDialog(null, (), (), // Cria uma janela mostrando um t�tulo, frase e PEDINDO algo
// MESMAS OPCOES DO DE CIMA

	int [var] = Integer.parseInt(JOptionPane.showInputDialog(null, () )); // Criar uma janelaque ira mostrar o que est� escrito e atribui o valor escrito pra [var] 
	String [var] = JOptionPane.showInputDialog(null, ()); // Criar uma janela e atribuir umnome/frase pra [var]]

	JOptionPane.showConfirmDialog(null, ()); // Cria janela com op��es de SIM, N�O, CANCELAR
	if(JOptionPane.YES_OPTION){ // Se a resposta for sim, faca
		//Fa�a algo
	}else if(JOptionPane.CANCEL_OPTION){ // Se a resposta for CANCEL faca
		System.exit(0); // Feche o programa
	}else([var] == JOptionPane.NO_OPTION) { // Se a resposta for N�O, faca
		do{ 
			JOptionPane.showInputDialog(null, ()); // Crie uma janela pedindo confirma��o
		}while ([var]==JOptionPane.NO_OPTION) // Enquanto a resposta for N�O
	}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA GERAR UM NUMERO ALEATORIO
 */
double [var] = 1 + (Math.random()*(11-1)); // Gera um numero de 1 a 10
int valor = (int)[var]; // Transforma o valor real em inteiro
System.out.println(valor);

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA IMPORTAR UM FORMATADOR
 */
DecimalFormat format = new DecimalFormat("#0.00"); 
System.out.println(format.format(());

