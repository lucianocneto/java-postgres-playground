package com.example;

class Cliente {
    private double renda;
    private char sexo;
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento; 
    }


    private int anoNascimento;

    double getRenda() {
        return renda;
    }

    //parametro renda dentro do metodo setRenda
    //nao devolve nada (void)
    void setRenda(double renda) {
        if (renda >= 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior do que zero");
    }
}

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando Classes Java");
        Cliente cliente = new Cliente();
        cliente.setRenda(10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());

        Cliente cliente2 = new Cliente();
        cliente2.setRenda(2000);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1990);
        System.out.println();

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
    }
}
