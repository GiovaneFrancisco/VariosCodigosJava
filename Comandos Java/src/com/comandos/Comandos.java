 CONVENCOES JAVA
Nome de classes:
	Nao pode usar acentos, espacoc e caracteres especiais (exceto _ )
	Nao podemos usar palavras reservadas
	Nome obrigatoriamente com a primeira letra maiuscula
	Usar Camel Case para mais de um nome
Nome de pacotes:
	Dominio ao contrario (ex: br.com.senac.java)

//INSTALAR DICIONARIO PT/BR
	Obter o dicionario
	Window -> Preferences -> General -> Editors -> Text editors -> Spelling
	Importar o dicionario -> Apply -> Ok
	Reiniciar

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA ADICIONAR/SUBTRAIR 1 UNIDADE DE UMA VARIAVEL
[var]++ // Adiciona 1 unidade
[var]-- // Subtrai 1 unidade
[var] + ++[var] // Soma 2 valores, adicionando 1 no 2

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA CONVERSÃO DE TIPOS DE VARIAVEIS
int [var] = Integer(parseInt(txt[var].getText())); // Ler um numero e colocar numa [var]
[var].setText(Integer.toString[var]); // Escrever um valor Inteiro
[var].SetText(Double.toString[var]); // Escrever um valor Real

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

//COMANDO PARA ESCREVER ALGO
float[var] = (); // Atribuir um valor real pra variavel
String[var] = (); // Atribuir uma frase pra uma variavel
System.out.print(); // Escrever algo na tela
System.out.printf(&quot;A nota ? %.1f&quot;, [var]) // Escrever um valor Real formatado [%.f]

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA LER ALGO
Scanner [objeto] = new Scanner(System.in); // Comando para entrada de dados
System.out.print();
String[var] = [objeto].nextLine(); // Ler a frase do [objeto] e atribuir na [var]
float[var] = [objetp].nextFloat(); // Ler um valor Real
int[var] = [objeto].nextInt(); // Ler um valor Inteiro

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA SOMAR E ATRIBUIR UM VALOR
int[var1];
int[var2];
[var1] += [var2]; // Soma o valor da 1 com a 2 e atribui na 1
[var1] -= [var2];

[var1] *= [var2];
[var1] /= [var2];
[var1] %= [var2];

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA ARREDONDAMENTO DE VALORES
Math.abs[var]; // Mostra o valor absoluto (Modulo)
Math.floor[var]; // Arredonda a [var] pra baixo
Math.ceil[var]; // Arredonda a [var] pra cima
Math.round[var]; // Arredonda a [var] aritmeticamente

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDOS MATEMATICOS
Math.pow(base,expoente); // Eleva a base ao expoente
Math.sqrt[var]; // Raiz quadrada da [var]/[num]
Math.cbrt[var]; // Raiz cúbica da [var]/[num]

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO SE
[var] = [var1]<[var2]?[var3/num3]:[var4/num4]; // Se [var1] < [var2], entao [var] recebe
[var3/num3], senao, [var4/num4]
< // Maior que
> // Menor que
>= // Maior ou igual
<= // Menor ou igual
== // Igual
!= // Diferente

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO IGUALDADE DE CONTEÚDO
String[var1] = ();
String[var2] = new String();
String[var3]

[var3] = ([var1].equals[var2])?():(); // Se o conteúdo de [var1] for igual a [var2], então,
senão

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA SE, SE NÃO, ENCADEADO
Scanner teclado= new Scanner(System.in);
int [var] = teclado.nextInt(); // Aguarda resposta do usuario
int [var] = 2018 - Nascimento; // Faz uma conta e armazena numa variavel
System.out.println([var]); // Mostra a variável
if ([var]&lt;16){ // Se a variável ()
System.out.println(&quot;&quot;); // Faça
}else if (([var]&gt;=16 &amp;&amp; [var]&lt;18)||([var]&gt;70)){ // Se nao, se a variável ()
System.out.println(); // Faça
}else{ // Se não
System.out.println(); // Faça
}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA ESTRUTURA DE REPETICAO
int Contador = 0 // Atribui um contador e coloca valor 0
while (CC&lt;(numero)){
//Faça oq quiser aqui
Contador++; // Adiciona 1 no CC
}
//Comando continue; interrompe o laço e continua a repetição
// Comando break; interrompe o laço e para a repetição

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO ESTRUTURA DE REPECIÇÃO COM TESTE NO FINAL
int Contador = 0
do{ // Faça algo
// Faça oq quiser

Contador++;
}While (Contador&lt;[num]); //Enquanto isso não acontecer

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO ESCOLHA CASO
int [var] = teclado.nextInt();
String [var]; // Variavel de frase
switch[var];{ // Escolha [Variável]
case (): // Caso () faça
[var] = () // Variavel recebe ()
break;
case (): // Caso () faça
[var] = () // Variável recebe ()
break;
default: // Caso nenhum das outras faça
[var] = () //Variável recebe ()
}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA ALTERAR A VISIBILIDADE DE ALGUM OBJETO
[objeto].setVisible(true/false);
// Para começar um programa com algo invisivel, coloca isso no PUBLIC do codigo fonte
public.(){
init.Components;
[objeto].setVisible();
}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA PEGAR UM NUMERO DE UM CONTROLE DESLIZANTE
/* Clica com direito no slider, Eventos, Change,...
* Vai criar uma classe praquele slider, l coloca
*/

[var].setText(Integer.toString([var].getValue()));

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA FATORIAL USANDO CONTROLE GIRATORIO
int Numero = Integer.parseInt(txtNum.getValue().toString()); // Número exibido no
controle giratOrio
int Fatorial = 1;
int Contador = Numero;
while (Contador&gt;=1){
Fatorial *= Contador ;
Contador-- ;
}
lblFatorial.setText(Integer.toString(Fatorial)); // Numero exibido como resultado

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA CRIAR UM VETOR
int Vetor[] = new int [()]; // Cria um vetor com () posições
int Vetor[] = {(), (), ()} // Cria um vetor com os valores [()]
for(int Contador=0; Contador&lt;=Vetor.length, Contador++){ // Para o contador indo da
posiçõo 0 até a última, faça
System.out.println(Vetor[cont]); // Escreva o valor na posição cont
}
for (int [var]: Vetor){ // A variável recebe o valor do vetor
System.out.println([var]);
}
System.out.print(vet.length); // Mostra a quantidades de casas que o vetor possui

Arrays.sort(Vetor); // Coloca o vetor em ordem numérica
Arrays.fill(Vetor ()); // Preenche o vetor com ()

int [var] = Arrays.binarySearch(num, ()); // Faz uma busca binária pelo ()

String[][] vetor = [()] [()]; // Cria um vetor multidimensional [(linha)][(coluna)]
for (int l = 0; l < vetor.length; l++) { // Para cada linhas
	for (int c = 0; c < vetor.length; c++) { // Para cada coluna
	}
}
		
ArrayList<String> vetor = new ArrayList<>(); //Cria um ArrayList
vetor.add() // Adiciona um item a lista
vetor.toString() // Mostra toda a lista
vetor.size() // Mostra o tamanho da lista
vetor.indexOf(()) // Procura por () na lista, responde true ou false
vetor.remove(()) // Remove () da lista



=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=


// COMANDO PARA CRIAR UM PROCEDIMENTO
static void [soma](int a,int b){ // Cria um procedimento de nome []
int [s] = a + b; // Diz oque o procedimento vai fazer
}
soma(5,2); // Chama o procedimento

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA CRIAR UMA JANELA DE TEXTO JOPTIONPANE
import java.util.ArrayList;

import javax.swing.JOptionPane;
JOptionPane.showMessageDialog(null, ()); // Cria janela MOSTRANDO um texto

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

JOptionPane.showMessageDialog(null, (), (), // Cria uma janela MOSTRANDO um texto e
um título [2¦()]
JOptionPane.INFORMATION_MESSAGE); // Cria uma janela com o símbolo de
informação (!)
JOptionPane.ERROR_MESSAGE); // Cria uma janela com símbolo de erro (X)
JOptionPane.WARNING_MESSAGE); // Cria uma janela com símbolo de cuidado
JOptionPane.PLAIN_MESSAGE); // Cria uma janela sem símbolo

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

JOptionPane.showInputDialog(null, (), (), // Cria uma janela mostrando um título, frase e
PEDINDO algo
// MESMAS OPCOES DO DE CIMA

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

int [var] = Integer.parseInt(JOptionPane.showInputDialog(null, () )); /* Criar uma janela
que ira mostrar o que está escrito
* e atribui o valor escrito pra [var] */
String [var] = JOptionPane.showInputDialog(null, ()); // Criar uma janela e atribuir um
nome/frase pra [var]]

int [var] = JOptionPane.showConfirmDialog(null, ()); // Cria janela com opções de SIM,
NÃO, CANCELAR
if([var] == JOptionPane.YES_OPTION){ // Se a resposta for sim, faca

}else if ([var]==JOptionPane.CANCEL_OPTION){ // Se a resposta for CANCEL faca
System.exit(0); // Feche o programa
}else if ([var] == JOptionPane.NO_OPTION) { // Se a resposta for NÃO, faca
do{ [var] = JOptionPane.showInputDialog(null, ()); // Repita () enquanto
}while ([var]==JOptionPane.NO_OPTION) // A resposta for NAO
}else{ // Se a resposta for CANCEL, faca
System.exit(0); // Feche o programa
}

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA GERAR UM NUMERO ALEATORIO
double [var] = 1 + (Math.random()*(11-1)); // Gera um numero de 1 a 10
int valor = (int)[var]; // Transforma o valor real em inteiro
System.out.println(valor);

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

// COMANDO PARA IMPORTAR UM FORMATADOR
DecimalFormat format = new DecimalFormat("#0.00"); 
System.out.println(format.format(());

