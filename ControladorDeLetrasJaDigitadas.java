class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String jaForam;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.jaForam="";
    }

    public boolean isJaDigitada (char ltr)
    {
        // percorrer o String this.jaForam e verificar se o mesmo
        // possui a letra ltr, retornando true em caso afirmativo
        // ou false em caso negativo
		boolean Letra = false;

			for(int i = 0; i< this.jaForam.length(); i++)
			{
				char v = jaForam.charAt(i);
					if(v == ltr)
					    Letra = true;

			}
		  return Letra;
    }

    public void registreUmaLetra (char ltr) throws Exception
    {
        if (isJaDigitada(ltr))
            throw new Exception ("Tentativa de registra letra ja registrada!");

        this.jaForam = this.jaForam+ltr;
    }

    public String toString ()
    {
        if (this.jaForam.compareTo ("") == 0)
            return "";

        String saida = "";
        int i;

        for (i=0; i<this.jaForam.length()-1; i++)
            saida = saida + this.jaForam.charAt (i) + ", ";

        saida = saida + this.jaForam.charAt (i);

        return saida;
    }

    public boolean equals (Object obj)
    {       // verificar se this e obj são iguais
			boolean retornaC = false;

					 if (this==obj)
					 	retornaC = true;;

					 if (obj!=this)
					 	retornaC = false;

					 if (obj.getClass()!= ControladorDeLetrasJaDigitadas.class)
					 	retornaC = false;

					 if (this.jaForam!=((ControladorDeLetrasJaDigitadas)obj).jaForam )
					 	retornaC = true;

			return retornaC;

    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return this.jaForam.hashCode();
    }

    public ControladorDeLetrasJaDigitadas (ControladorDeLetrasJaDigitadas c) throws Exception // construtor de cópia
    {
        // copiar c.jaForam em this.jaForam
        if(c==null)
        throw new Exception ("Não possui nada digitada");
        this.jaForam = c.jaForam;
    }

    public Object clone ()
    {
        // retornar uma copia de this
		        ControladorDeLetrasJaDigitadas ret = null;

				try
				{
					return new ControladorDeLetrasJaDigitadas (this);
				}
				catch(Exception erro)
				{}//sei que nao vai dar erro
			return ret;
    }
}