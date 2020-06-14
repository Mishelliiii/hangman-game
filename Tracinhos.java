class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if (qtd<=0)
            throw new Exception ("Tentativa de criar palavra com quantidade de letras invalida!");

        this.texto = new char [qtd];

        for (int i=0; i<qtd; i++)
            this.texto[i] = '_';
    }

    public void desvele (int pos, char ltr) throws Exception
    {
        if (pos<0 || pos>=texto.length)
            throw new Exception ("Tentativa de substituir letra em posicao inexistente!");

        this.texto[pos] = ltr;
    }

    public boolean isComTracinhosAinda ()
    {
        // percorrer o vetor de char this.texto e verificar
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        int posi = 0;

	      if(this.texto[posi] == '_')
      	    return true;

		 else
		    posi++;


	      return false;

    }

    public String toString ()
    {
        String saida = "";
        int i;

        for (i=0; i<this.texto.length-1; i++)
            saida = saida + this.texto[i] + ' ';

        saida = saida + this.texto[i];

        return saida;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
         boolean retornaB = false;

		 if (this==obj)
		 	retornaB = true;;

		 if (obj!=this)
		 	retornaB = false;

		 if (obj.getClass()!= Tracinhos.class)
		 	retornaB = false;

		 if (this.texto!=((Tracinhos)obj).texto )
		 	retornaB = true;

			return retornaB;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
         int ret = 1;
       ret = ret * 2 +(this.texto).hashCode();

       return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto]
        if(t==null)
          throw new Exception("Não possui erros");
		      this.texto = t.texto;
    }

    public Object clone ()
    {
        // retornar uma copia de this
        Tracinhos ret = null;

				try
				{
					ret = new Tracinhos(this);
				}
				catch(Exception erro)
				{}//sei que nao vai dar erro
			return ret;
    }
}