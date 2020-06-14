public class BancoDePalavras
{
    private String banco [] = {"JAVA",
                               "CLASSE",
                               "OBJETO",
                               "INSTANCIA",
                               "PUBLICO",
                               "PRIVATIVO",
                               "METODO",
                               "CONSTRUTOR",
                               "SETTER",
                               "GETTER",
                               "LUZ",
                               "PRAZER"};

    public Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra = new Palavra (this.banco [(int)(Math.random() * this.banco.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }

    public String toString ()
    {
        // resultar um String contendo as palavras do banco
         String nome = "";

         for(int i = 0;i<this.banco.length;i++)
         {
			 nome += banco[i];
			 nome +=("\n");


		 }
		return nome;

    }

	public boolean equals (Object obj)
	{
			// verificar se this e obj possuem o mesmo conteúdo, retornando
			// true no caso afirmativo ou false no caso negativo

		boolean retorna = false;

			if (this==obj)
				retorna = true;;

			if (obj!=this)
				retorna = false;

			if (obj.getClass()!= BancoDePalavras.class)
				retorna = false;

			if (this.banco!=((BancoDePalavras)obj).banco )
			    retorna = true;

			return retorna;

   }
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return this.banco.hashCode();
    }
}