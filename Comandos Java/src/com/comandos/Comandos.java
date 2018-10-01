/CONVE��ES JAVA
Nome de classes:
	N�o pode usar acentos, espacoc e caracteres especiais (exceto _)
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
	
	String num = "10.3";
	Integer.parseInt(num);   //Mudan�a de String para Int
	Float.parseFloat(num);   //Mudan�a de String para Float
	Double.parseDouble(num); //Mudan�a de String para Double
	
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
 * TRATAMENTO DE EXCE��ES
 */

	try {
		//Instru��o sujeita a falha
	}catch(Exception e){
		//Instru��es para contornar o erro
		System.out.println(e.getMessage());
	}catch(SQLException sqle) { //Exce��o ao acessar o banco de dados
		System.out.println(sqle.getMessage());
	}catch(IOException ioe){ //Exce��o de Input/Output
		System.out.println(ioe.getMessage());
	}

	e.printStackTrace(); //Detalha em qual linha e em qual lugar ocorreu o erro para o programador
	
	
	void abrirArquivo() throws FileNotFoundException{ //Defique que a exce��o ser� tratada por quem chamou este m�todo
		FileReader texto;
		texto = new FileReader("C:\\arquivos\\cartax.txt");
	}
	
	try {
		abrirArquivo();
	}catch(FileNotFoundException e) {
		JOptionPane.showMessageDialog(null, "O arquivo n�o foi encontrado"); //Caso o m�todo nao consiga seguir as instru��es, vai abrir uma mensagem de erro
	}finally { //Uma instru��o que SEMPRE ser� executado, independente de sucesso ou falha do try/catch
		//Algo que ser� executado
	}
	
	throw new Exception([]); //Cria uma exce��o com mensagem []
	
	throws SaldoInsuficienteException //Cria um Exception personalizado
	throw new SaldoInsuficienteException("") //Cria uma mensagem para ser exibida quando ocorrer o erro
	
	public class SaldoInsuficienteException extends Exception{
		public SaldoInsuficienteException() {
			super();
		}
		public SaldoInsuficienteException(String message) {
			super(message);
		}
	} //Cria��o da classe para executar uma exce��o personalizada
	
	
	e.InputMismatchException //Exce��o para erro de valores num�ricos
	
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * CRIAR UM PROCEDIMENTO
 */
	public static void [soma](int a,int b){ // Cria um procedimento de nome []
		int [s] = a + b; // Diz oque o procedimento vai fazer
	}
	
	{
	soma(5,2); // Chama o procedimento passando par�metros
	int a = 5;
	int b = 2;
	soma(a,b); // Chama o procedimento passando par�metros de vari�veis
	
	}
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * GENERICS BAG
 */
	public class Bolsa<T>{ //Cria��o de uma bolsa com um tipo T indefinido
	 	private T valor; //Cria��o de uma vari�vei gen�rica, aceita qualquer vari�vel
	 
		public T getValor() { 
			return valor
		}
		
		public T setValor() {
			this.valor = valor;
		}
	}

    //=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

	public class Trio<T>{ //Cria��o de um generic que comporta 3 informa��es de tipos diferentes
		private T primeiro; //Vari�veis gen�ricas
		private T segundo;
		private T terceiro;
		
		public T getPrimeiro() { //M�todo Get & Set para definir as vari�veis
			return primeiro;
		}
		public T setPrimeiro(T valor) {
			this.peimeiro = primeiro
		}
		...
	}
	
	Trio<Integer> trio1 = new Trio<Integer>(); //Um trio definido para Integer
	trio1.setPrimeiro(39);
	trio1.setSegundo(500);
	trio1.setTerceiro(10);
	
	trio<String> trio2 = new Trio<String>(); //Um trio definido para String
	trio.setPrimeiro("OIAJDAIOSD");
	...
	
	//=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=
	
	public class Trio<T,U,V>{ //Cria��o de um tio com 3 tipos indefinidos, porem diferentes entre s�
		private T primeiro;
		private U segundo;
		private V terceiro;
		
		public T getPrimeiro() {
			return primeiro;
		}
		public void setPrimeiro(T valor) {
			this.primeiro = valor;
		}
		...
	}

	Trio<Integer, String, Produto> trio1 = new Trio<Integer, String, Produto>(); //Implementa��o de um trio com 3 valores diferentes
	trio1.setPrimeiro(30);
	trio1.setSegundo("IUASDHKSD");
	...
	
	//=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=
	
	//Cria��o de um m�todo para return do �ltimo �tem de um array com tipo indefinido
	
	public static <T> T ultimoItem(T[] array) {
		if(array == null || array.length.equals(0)) { //Se o array estiver vazio
			return null; //Retorne null
		}else { //Se tiver algum item
			return array[array.length-1]; //Retorte no ultimo item desse array
		}
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * UTILIZA��O DE LISTAS/SET
 */
	
	Set<Fincionario> conjunto = new HasSet<Funcionario>(); //Cria um conjunto de objetos usando uma ordem 
	conjunto.add(new Funcionario(201, "Maria")); //Adiciona um item ao conjunto
	
	SortedSet //Faz a organiza��o seguindo um crit�rio espec�fico baseado no maior/menos
	SortedSet<Cliente> set = new TreeSet<Cliente>();
	set.add(new Cliente((), (), () ));
	...
	
	for(Cliente c : set) {
		System.out.println(c.getNome()); //Exibe o nome de todos os clientes em ordem alfab�tica
	}
	
	
		- implements Comparable<Cliente>
	
		public int compareTo(Cliente other) { //Quando um cliente A chamar o m�todo passando o cliente B, vai ser comparado os nomes de ambos
		return this.nome.compareTo(other.nome);
	}

	compareTo String -> Valor positivo, String A > B; Valor negativo, String B > A; Valor 0, String A = B
	compareTo int -> �rdem num�rica
	
	first(); //Retorna o menor elemento
	last(); //Retorna o maior elemento
	headSet(T); //Retorna os itens at� esse item
	tailSet(T); //Retorna os itens apartir desse item
	subSet(T,T); //Retorna os itens entre os especificados
	}
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * MAP
 */
	put(k,v) //Adiciona um elemento com chave K e conte�do V
	get(k) //Obtem o �tem do elemento de chave K
	remove(K) //Remove a linha do objeto
	clear() //Apaga todos os elementos
	size() //Retorna o tamanho do map
	keySet() //Retorna um conjunto contendo  as chaves do mapa
	
	Map<String, Object> mapa = new HashMap<String, Object>() //Cria um mapa
	mapa.put("nome", "Manuel"); //Adiciona itens ao mapa
	mapa.put("idade", 27);
	mapa.put("salario", 1234.3);
	mapa.put("nascimento", new GregorianCalendar(1985, 0, 15));
	
	
	String nome = (String) mapa.get("nome"); //Recupera itens do mapa
	Integer idade = (Integer) mapa.get("idade");
	Double salario = (Double) mapa.get("salario")
			
			Set<String> chaves = mapa.keySet();

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * FILE/PATH
 */
	
	Path path1 = Paths.get("C:\\Meus Documentos\\docs");
	Path path2 = Paths.get("..\\Arquivo_Nivel_acima.mp3");
	
	toAbsolutePath(); //Retorna uma String com o caminho completo para o path
	getFileName(); //Retorna uma String contendo o nome e o diret�rio do path
	getParent(); //Retorna o Path referente ao diret�rio
	resolve(String); //Cria um novo Path para um arquivo ou subdiret�rio contido no diret�rio por esse Path
	
	Files.exists(path); //Verifica se o path existe, retorna boolean
	Files.isDirectory(path); //Verifica se o path existe e � um diret�rio
	Files.isRegularFile(path); //Verifica se o path existe e � um arquivo
	Files.size(path); //Retorna um long contendo o tamanho em bytes do arquivo
	Files.createDirectory(path); //Cria um diret�rio referente ao path
	Files.createDirectories(path); //Cria recursivamente os diret�rios referentes ao path
	
	Files.move(path1, path2); //Move o arquivo ou diret�rio 
	Files.copy(path1, path2); //Copia o arquivo ou diret�rio
	Files.delete(path); //Apaga o arquivo ou diret�rio
	Files.createFile(path); //Cria um arquivo de tamanho 0 no path
	Files.list(path); //Retorna um Stream<Path> apontando para os arquivos e subdiret�rios no path
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=
			
/**
 * LEITURA DE TEXTO
 */
	
	Exceptions
		FileNotFoundException -> Quando tenta ler/gravar um arquivo e ele n�o existe
		EOFException -> Quando tenta ler/capturar informa��es al�m do limite do arquivo
	
	Reader
		Classe usada para ler uma String de caracteres
				
		Reader reader1 = new FileReader("C:\\carta.txt"); //Tenta ler o arquivo												|				
		reader1.close(); //Fecha o arquivo de texto para ele n�o ser alterado												|
																															|
		char[] dados = new char[4]; //Cria um array para armazenar os caracteres											|
		dados[0] = (char)reader1.read(); //L� o caractere, salva no array e pula para o pr�ximo mas n�o l�					|
		dados[1] = (char)reader1.read();																					|} L� UM caractere por vez	
		...																													|						
		reader1.close();																									|						
		String texto = new String(dados); //Transforma os n�meros(char) lidos em caracteres									|								
		System.out.println(text); //Exibe o texto																			|					
		
		
		char[] dados = new char[4]; //Cria um array para armazenar os caracteres											|
		int quant = reader.read(dados); //Tenta ler todos os caracteres, retorna um int com o valor de caracteres lidos		|
		reader.close();																										|} L� V�RIOS caracteres por vez
		String texto = new String(dados);																					|	
		System.out.print(texto);																							|
		
		
	BufferedReader 
		BufferedReader reader = new BufferedReader(new FileReader("C:\\carta.txt"));
		if(reader.ready()) { //Se houver alguma linha para ser lida
			System.out.println(reader.readLine()); //Leia a linha e exiba
		}
		
		while(reader.ready()) { //Enquanto houver uma linha para der lida
			System.out.print(reader.readLine()); //Leia a linha e exiba
		}
		reader.close();
		
/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * GRAVA��O DE TEXTO		
 */
	
	Writer escritor = new FileWriter("C:\\carta.txt", true); //O uso do TRUE define que as informa��es ser�o adicionadas ao final da frase/texto e n�o que ir�o substituir um existente
	escritor.write("Java � divertido"); //Escreve a String do documento selecionado
	escritor.close()
	
	BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\carta.txt"));
	writer.write("linha 1");
	writer.newLine(); //Pula uma linha
	writer.write("Linha 2");
	writer.close();
		
	PrintWriter writer = new PrintWriter("C:\\carta.txt");
	writer.print();
	writer.println();
	writer.printf();
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * ASSER��ES
 */
	Instru��o neutra para quando o programa est� pronto, mas � �til enquanto se est� programando
	
	assert <express�o>; //Valida uma express�o
	assert <express�o> : [mensagem]; //Valida uma express�o e exibe uma mensagem 
	
	java -ea [Classe]
			
	java -disableassertions

	java -ea:br.com.utils...
		 -ea:br.com.escola...
		 -da:br.com.qualquercoisa...
		 
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * THREADS
 */
	Comandos que s�o executados linearmente 
	Programa MultiThread/Concorrente
		Programa com v�rias linhas do tempo onde elas s�o executadas simultaneamente
		
		//Classe secund�ria
		public class MinhaThread extends Thread{
			public void run() {
				//C�digos secund�rios para serem executados
			}
		}
		
		//Classe main
		public class Principal{
			main{
				Thread t = new Minha Thread();
				t.start();
				//Demais c�digos para serem executados
			}
		}
	
		Thread.sleep([tempo]) //Faz com que tenha um delay de [tempo] mili segundos
		
		Thread t1 = new MinhaThread();
		...
		Thread t5 = new MinhaThread();
		
		t1.setPriority(2);
		t2.setPriority(8);
		t3.setPriority(Thread.MAX_PRIORITY); //Prioridade 10
		t4.setPriority(Thread.MIN_PRIORITY); //Prioridade 1
		t5.setPriority(Thread.NORM_PRIORITY) //Prioridade 5 - Padr�o

		t1.setName("Thread auxiliar"); //Seta um nome para a thread
		
		Thread t = Thread.currentThread(); //Cria uma vari�vel para poder pegar informa��es da Thread atual
		t.getName(); //Mostra o nome da Thread
		t.getPriority(); //Mostra a prioridade da Thread
		
		
		Thread new
			Uma Thread instanciada mas que N�O foi iniciada
		Thread runnable
			Uma Thread que foi iniciada e est� pronta para ser iniciada
		Threadh terminated
			Uma Thread que terminou todas as suas fun��es, n�o pode sofrer um novo start()
		Thread sleepy
			Uma Thread � pausada pelo tempo determinado pelo m�todo .sleep(), � reativada ao terminar esse tempo
		Thread waiting
			Uma Thread que est� esperando por uma informa��o que ser� dada por outra Thread
			.join()
		Thread bloked
		 	Uma Thread que est� esperando o lock de uma outra Thread
		 	
		 	public synchronized boolean add() {		|	
			}										|} M�todos que usam synchronized para impedir uso simult�neo por Threads 	
			public synchronized Object remove() {	|
			}
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * JDBC
 */
	
	Transa��es
	try {
		bd.setAutoCommit(false); //Faz com que todos os comandos de execu��o do banco de dados sejam efetuados antes de seres inseridos
		bd.executeUpdate(...) //Comando de Atualiza��o/Deletar/Copiar
		...
		bd.commit();
	}cath{
		bd.rollback(); //Se alguma das instru��es dentro do TRY der errado, tudo vai ser desfeito e nada vai dar UPDATE
	}
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * MANIPULA��O DE DATA
 */
	LocalDateTime agora = LocalDateTime.now(); //Pega a hora atual do sistema
	DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Cria uma m�scara para Dia/M�s/Ano Hora:Minuto:Segundo
	System.out.print(mascara.format(agora)); //Faz com que a hora fique dentro da m�scara
	
	LocalDateTime.of(ano,mes,dia,hora,min,seg,nano); //Cria uma hora baseado nas informa��es
	LocalDateTime.parse(string,mascara); //Pega a String da data e coloca dentro da m�scara
	
	LocalDateTime data;
	data.with(TemporalAdjusters.); //Altera algumas coisas da data, v�rios m�todos �teis
	
	data.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()); //Mostra todo o nome do m�s na l�ngua default do computador
	
=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * COMANDO PARA CRIAR UMA JANELA DE TEXTO JOPTIONPANE
 */

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
	DecimalFormat mascara = new DecimalFormat("#0.00"); 
	System.out.println(mascara.format(());

=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * CRIA��O DE UM JFrame
 */

	JFrame tela = new JFrame();
	setTitle("")
	setDefaultCloseOperation(valor); //VALOR = 0 -> N�o fa�a nada
									 //VALOR = 1 -> Minimiza
									 //VALOR = 2 -> Dispose
									 //VALOR = 3 -> Fecha
	setSize(new Dimention(comprimento,altura));
	setLocationRelativeTo(null);
	.getContentPane().setBackground(Color.COR);
	
	}

	=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=

/**
 * CRIA��O DE UMA TABELA
 */
	Adiciona um JCrollPane
	Adiciona JTable no "ViewPort"
	Abre propriedade Model do JTable, Insert para cada Linha e Coluna
	
	usa setString para definir um parametro de consulta no banco de dados
	usa getString/int/Double/LocalDateTime para recuperar as informa��es do banco
	
	List<"objeto"> lista = new ArrayList<>();
	lista.add("objeto");
	
	private Object[][] preencherTabela(List<"objeto"> lista){
		Object[][] conteudo = new Object[lista.size()][n� colunas];
		
		for(int i=0; i<lista.size(); i++) {
			conteudo[i][0] = //Set dos atributos para serem exibidos
		}
	}
	
	=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=
			
/**
 * Como criar um JAVADOC
 */
	
	Seleciona o projeto FINALIZADO
	Project -> Generate JavaDOC
	Se nao tiver achado a pasta, abra o diret�rio do JAVA -> Pasta bin -> seleciona Java.exe
	Ele vai salvar uma pasta dentro do workspace com .doc
	
	
	
	
	