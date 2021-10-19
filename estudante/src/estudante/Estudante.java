package estudante;

public class Estudante  { 

	 

	   private int matricula; 
	   private String nome; 
	   private char sexo;
	   private double notas[] = new double [4];

	   public Estudante() { }

	   public Estudante( int matricula, String nome, char sexo ) {

	      setMatricula( matricula );
	      setNome( nome );
	      setSexo( sexo );
	   }

	   public void setMatricula( int matricula ) {

	      this.matricula = matricula;
	   }

	   public void setNome( String nome ) {

	      this.nome = nome;
	   }

	   public void setSexo( char sexo ) {

	      this.sexo = sexo;
	   }

	   public int getMatricula() {

	      return matricula;
	   }

	   public String getNome() {

	      return nome;
	   }
       public char getSexo() {

		   return sexo;
	   }

	   public void addNota( int numeroProva, double nota ) {

	      notas[numeroProva-1] = nota;
	   }

	   public double getNota( int numeroProva ) { 

	      return notas[ numeroProva-1 ];
	   }

	   public String toString() { 

	     return new String(

	        "Matricula: " + getMatricula() + "\n" +
	        "Nome: " + getNome()           + "\n" +
	        "Sexo: " + getSexo()           + "\n"
	     );
	   }

	}