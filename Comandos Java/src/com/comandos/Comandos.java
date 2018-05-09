 CONVEÇÕES JAVA
Nome de classes:
	Não pode usar acentos, espacoc e caracteres especiais (exceto _ )
	Não podemos usar palavras reservadas
	Nome obrigatoriamente com a primeira letra maiúscula
	Usar Camel Case para mais de um nome
Nome de pacotes:
	Domínio ao contrário (ex: br.com.gff.java)

//INSTALAR DICIONARIO PT/BR
	Obter o dicionario
	Window -> Preferences -> General -> Editors -> Text editors -> Spelling
	Importar o dicionario -> Apply -> Ok
	Reiniciar

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * MANIPULAÇÃO DE VARIÁVEL 
 */

	int num1, num2;
	num1 ++; //Adiciona 1 unidade
	num1 --; //Subtrai 1 unidade
	num1 + ++num2; //Soma os 2 valores, com 1 unidade a mais no 2

	num1 += num2; //Soma e atribúi o valor num2 em num1
	num1 -+ num2; //Subtrai e atribúi o valor num2 em num1
	num1 *= num2; //Multiplica e atribúi o valor num2 em num1
	num1 /= num2; //Divide e atribúi o valor num2 em num1
	
	txtNum1.setText(Integer.toString(num1)); //Coloca no campo de texto o valor Int num1
	txtNum1.setText(Double.toString(num1)); //Coloca no campo de texto o valor double num1
	
	num1 = Integer.parseInt(txtNum1.getText()); //Pega o campo de texto e coloca na variável num1
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * MANIPULAÇÃO DE TEXTO
 */

	String frase = "Alguma coisa"; 
	System.out.println(frase); //Escreve o que estiver dentro da variável
	
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
	Math.cbrt(num1); // Raiz cúbica da [var]/[num]

	Math.sin(num1); //Seno 
	Math.cos(num1); //Cosseno 
	Math.tan(num1); //Tangente
	Math.toDegrees(angR); //Mudança de Radiano para Grau
	Math.toRadians(angD); //Mudança de Grau para Radiano
	Math.PI; //Valor de PI

	Math.max(num1,num2); //Maior valor
	Math.min(num1,num2); //Menor valor

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO SE
 */
	if(num1 < num2) { //Se num1 < num2
			//Algo acontece
	}else if(num2 < num1) { //Senão, se num2<num1
			//Algo acontece
	}else { //Se nenhuma das outras
		 	//Algo acontece
	}

	int num3 = num1<num2?():() //Se num1<num2, num3 recebe o 1o (), senão, recebe o 2o ()

			< // Maior que
> // Menor que
>= // Maior ou igual
<= // Menor ou igual
== // Igual
!= // Diferente

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO IGUALDADE DE CONTEÚDO
 */
	String frase1 = "aaaaa";
	String frase2 = "AAAAA";
	
	frase1.equals(frase2); //Retorna true se ambas forem idênticas
	frase1.equalsIgnoreCase(frase2); //Retorna true se, desconsiderando acentos e maiúsculas, forem iguais
	
	StringBuilder frase3 = newStringBuilder("BBBBB");
	frase3.append("()"); //Adiciona "()" no final da frase
	frase3.insert([num], "()"); //Adiciona "()" a partir do índice ()
	frase3.delete([num]); //Deleta TUDO a partir do índice ()

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * ESTRUTURAS DE REPETIÇÃO
 */
	int contador = 0; // Atribui um contador e coloca valor 0
	while (contador<[num]){ //Enquanto o contador for menor do que o (número), 
			//Faça oq quiser aqui
		contador++; // Adiciona 1 no CC
	} //[Faz o teste no início]
	
	//Comando continue; interrompe o laço e continua a repetição
	// Comando break; interrompe o laço e para a repetição

	do{ // Faça algo
		// Faça oq quiser
		contador++;
	}while (contador<[num]); //Enquanto isso não acontecer
	//[Faz o teste no final]

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO ESCOLHA CASO
 */
	
	switch[var];{ // Escolha [Variável]
		case ([var]): // Caso () faça
			//Faça algo
			break;
		case ([var]): // Caso () faça
			//Faça algo
			break;
		default: // Caso nenhum das outras faça
			//Faça algo
	}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 *  VETOR / MATRIZ
 */
	int vetor[] = new int [()]; // Cria um vetor com () posições
	int vetor[] = {(), (), ()} // Cria um vetor com os valores [(), (), ()]
		
	for(int i=0; i<vetor.length; i++){ // Para o contador indo da posiçõo 0 até a última, faça
		System.out.println(Vetor[cont]); // Escreva o valor na posição cont
	}
	
	for(int [var]:vetor){ // A variável recebe o valor do vetor
		System.out.println([var]);
	}
	
	vetor.length //Mostra a quantidade de casas de um vetor
	
	Array.toString(); //Transforma o Array em String
	Arrays.sort(vetor, 0, vetor.length); //Ordena alfabeticamente o vetor ([nome], [início], [fim])
	Arrays.fill(Vetor ()); // Preenche o vetor com ()

	
	int [var] = Arrays.binarySearch(num, ()); // Faz uma busca binária pelo ()

	String[][] vetor = [()] [()]; // Cria um vetor multidimensional [(linha)][(coluna)]
	for (int l = 0; l < vetor.length; l++) { // Para cada linhas
		for (int c = 0; c < vetor.length; c++) { // Para cada coluna
			System.out.print(vetor[l][c]); //Escreve o que está la linha/coluna
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
	soma(5,2); // Chama o procedimento passando parâmetros
	int a = 5;
	int b = 2;
	soma(a,b); // Chama o procedimento passando parâmetros de variáveis
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=


/**
 * COMANDO PARA ALTERAR A VISIBILIDADE DE ALGUM OBJETO
 */
[objeto].setVisible(true/false);
// Para começar um programa com algo invisivel, coloca isso no PUBLIC do codigo fonte
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
int Numero = Integer.parseInt(txtNum.getValue().toString()); // Número exibido no
controle giratório
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

	JOptionPane.showMessageDialog(null, (), (), // Cria uma janela MOSTRANDO um texto e um título [2o ()]
		
		JOptionPane.INFORMATION_MESSAGE); // Cria uma janela com o símbolo deinformação (!)
	JOptionPane.ERROR_MESSAGE); // Cria uma janela com símbolo de erro (X)
	JOptionPane.WARNING_MESSAGE); // Cria uma janela com símbolo de cuidado
	JOptionPane.PLAIN_MESSAGE); // Cria uma janela sem símbolo

	JOptionPane.showInputDialog(null, (), (), // Cria uma janela mostrando um título, frase e PEDINDO algo
// MESMAS OPCOES DO DE CIMA

	int [var] = Integer.parseInt(JOptionPane.showInputDialog(null, () )); // Criar uma janelaque ira mostrar o que está escrito e atribui o valor escrito pra [var] 
	String [var] = JOptionPane.showInputDialog(null, ()); // Criar uma janela e atribuir umnome/frase pra [var]]

	JOptionPane.showConfirmDialog(null, ()); // Cria janela com opções de SIM, NÃO, CANCELAR
	if(JOptionPane.YES_OPTION){ // Se a resposta for sim, faca
		//Faça algo
	}else if(JOptionPane.CANCEL_OPTION){ // Se a resposta for CANCEL faca
		System.exit(0); // Feche o programa
	}else([var] == JOptionPane.NO_OPTION) { // Se a resposta for NÃO, faca
		do{ 
			JOptionPane.showInputDialog(null, ()); // Crie uma janela pedindo confirmação
		}while ([var]==JOptionPane.NO_OPTION) // Enquanto a resposta for NÃO
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

