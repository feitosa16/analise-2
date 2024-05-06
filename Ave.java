public abstract class Ave {
    protected String nome;
    protected double peso;

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos abstratos que todas as aves devem implementar
    public abstract void pia();
    public abstract void anda();
    public interface Cantante {
        void canta();
    }
    // Classe AveMarinha
    public static abstract class AveMarinha extends Ave {
        @Override
        public void pia() {
            System.out.println(getNome() + " está piando de maneira característica de Ave Marinha!");
        }

        @Override
        public void anda() {
            System.out.println(getNome() + " está andando na beira do mar!");
        }

        public void nada() {
            System.out.println(getNome() + " está nadando!");
        }

        // Método adicional para Pinguins cantarem
       public abstract void canta();
    }

    // Classe AveTerrestre
    public static class AveTerrestre extends Ave {
        public void corre() {
            System.out.println(getNome() + " está correndo!");
        }

        @Override
        public void pia() {
            System.out.println(getNome() + " está piando de maneira típica de Ave Terrestre!");
        }

        @Override
        public void anda() {
            System.out.println(getNome() + " anda pelo chão!");
        }
    }

    // Classe Avestruz (Ave Terrestre que não canta)
    public static class Avestruz extends AveTerrestre {
        public void camufla() {
            System.out.println(getNome() + " está se camuflando!");
        }
    }

    // Classe Pinguim (Ave Marinha que canta)
    public static class Pinguim extends AveMarinha {
        private Pinguim conjuge;

        public void setConjuge(Pinguim conjuge) {
            this.conjuge = conjuge;
        }

        public Pinguim getConjuge() {
            return conjuge;
        }

        // Método adicional para Pinguins cantarem
       @Override
        public void canta() {
            System.out.println(getNome() + " está cantando!");
        }
    }

    // Classe Passaro (Ave que canta e voa)
    public static abstract class Passaro extends Ave {
        public abstract void voa();
        public abstract void canta();
    }

    // Classe BeijaFlor
    public static abstract class BeijaFlor extends Passaro {
        @Override
        public void voa() {
            System.out.println(getNome() + " está voando habilidosamente!");
        }

        @Override
        public void canta() {
            System.out.println(getNome() + " está cantando melodicamente!");
        }
    }

    // Classe Papagaio
    public static abstract class Papagaio extends Passaro {
        public void fala() {
            System.out.println(getNome() + " está falando!");
        }

        @Override
        public void voa() {
            System.out.println(getNome() + " está voando!");
        }

        @Override
        public void canta() {
            System.out.println(getNome() + " está imitando outros pássaros!");
        }
    }


}


