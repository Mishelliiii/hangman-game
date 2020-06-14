class ControladorDeErros implements Cloneable
{
    protected int qMax, qErr=0;

    public ControladorDeErros (int qm) throws Exception
    {
        if (qm<=0)
            throw new Exception ("Tentativa de criar um controlador de erros que admite quantidade maxima de erros negativa!");

        this.qMax = qm;
    }

    public void registreUmErro () throws Exception
    {
		  // verifica se this.qErr ja é igual a this.qMax,
		  // lançando excecao em caso positivo ou
          // incrementando this.qErr em caso negativo = aumentar 1

          if(this.qErr == this.qMax)
		  		throw new Exception("Não é igual.");
		this.qErr ++;
    }

    public boolean isMaximoDeErrosAtingido ()
    {
        return this.qErr == this.qMax;
    }

    public String toString ()
    {
        return this.qErr + "/" + this.qMax;
    }

    public boolean equals (Object obj)
    {
		// verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        if (this==obj)
	        return true;

	    if(obj==null)
		   return false;

		if(obj.getClass()!= ControladorDeErros.class)
		   return false;

		if(this.qMax != ((ControladorDeErros)obj).qMax || this.qErr != ((ControladorDeErros)obj).qErr)
		   return false;

	   return true;

    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 1;/*qualquer valor menos 0*/

         ret = ret*2 + new Integer(this.qMax).hashCode();
         ret = ret*2 + new Integer(this.qErr).hashCode();

         return ret;

    }

    public ControladorDeErros (ControladorDeErros c) throws Exception
    {
        // copiar c.qMax e c.qErr, respectivamente em, this.qMax e this.qErr
        if(c==null)
        throw new Exception("Não possui erros");
        this.qMax = c.qMax;
        this.qErr = c.qErr;
    }

    public Object clone ()
    {
        // returnar uma cópia de this
         ControladorDeErros ret = null;

		try
		{
			ret = new ControladorDeErros (this);
		}
		catch(Exception erro)
		{}//sei que nao vai dar erro
			return ret;
    }
}