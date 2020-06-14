class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String txt) throws Exception
    {
        if (txt == null || txt.equals(""))
            throw new Exception ("Tentativa de criar palavra a partir do nada");

        this.texto = txt;
    }

    public int getQuantidadeDessaLetra (char ltr)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras iguais a ltr existem nele
       int qtdLtr =0;

       for (int i= 0; i< texto.length(); i++)
        {
             if(texto.charAt(i) == ltr)
              	qtdLtr++;
        }

       return qtdLtr;
    }

    public int getPosicaoOcorrenciaDessaLetra (int ord, char ltr) throws Exception
    {
		 // se ord==0, retorna a posicao em que ocorre
		 // a primeira aparicao de ltr em this.texto;
		 // se ord==1, retorna a posicao em que ocorre
		 // a segunda aparicao de ltr em this.texto.
		 // se ord==2, retorna a posicao em que ocorre
		 // a terceira aparicao de ltr em this.texto;
		 // e assim por diante.
	     // lançar excecao caso nao encontre
		 // a ltr procurada.

		int qtdLtr = this.getQuantidadeDessaLetra (ltr);
		if(ltr == 0 || qtdLtr > ord+1)
			throw new Exception("Letra Não Encontrada na Palavra");

		int qtdAtual = 0;

		 for(int i = 0; i< this.texto.length(); i++)
		 {
			  if(texto.charAt(i) == ltr)
			  {
				  if(qtdAtual == ord)
				  	return i;

				  qtdAtual++;
			  }




	     }
	      return qtdAtual;
     }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo

        boolean retornaA = false;

					if (this==obj)
						retornaA = true;;

					if (obj!=this)
						retornaA = false;

					if (obj.getClass()!= Palavra.class)
						retornaA = false;

					if (this.texto!=((Palavra)obj).texto )
					    retornaA = true;

			return retornaA;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
         return this.texto.hashCode();
    }

    public int compareTo (Palavra p)
    {
        return this.texto.compareTo (p.texto);
    }

}