
package uff.ic.lleme.tcc00328.s20202.provas.p2.LuanPeixotoJardim.Q1;

public class LuanPeixotoJardim {
    
    public static Dicionario dicionario = new Dicionario(); 
    public static String significado1a = "coleção de folhas de papel, impressas ou não, reunidas em cadernos cujos dorsos são unidos por meio de cola, costura etc., formando um volume que se recobre com capa resistente.";
    public static String significado1b = "aquilo que resulta de um trabalho, de uma ação.";
    public static String significado2 = "obra de cunho literário, artístico, científico etc. que constitui "
            + "um volume [Para fins de documentação, é uma publicação não periódica com mais de 48 páginas, "
            + "além da capa.].";
    public static void main(String[] args) {
        Substantivo[] subs = new Substantivo[4];
        Substantivo obra = new Substantivo("obra","o-bra", significado2);
        Substantivo livro = new Substantivo("livro","li-vro", significado2);
        Substantivo livro2 = new Substantivo("livro","li-vro", significado1a);
        Substantivo obra2 = new Substantivo("obra","o-bra", significado1b);
        subs[0] = obra; subs[1] = livro; subs[2] = livro2; subs[3] = obra2;
        
        carregarDicionario(dicionario, subs, null);
        
        dicionario.organizarDicionario();
        
        Sinonimo teste = dicionario.getSubstantivos()[0]; 
        System.out.println(teste.getSignificado() + "\n");
        for (int i = 0; dicionario.getSubstantivos()[0].getPalavras()[i] != null; i++) {
            System.out.println(dicionario.getSubstantivos()[0].getPalavras()[i].getGrafia() + "\n");
        }
    }
    
    public static void carregarDicionario(Dicionario _dicionario, Substantivo[] _subs, Verbo[] _verbos) {
        if (_subs != null) {
            int i;
            for (i = 0; i < _subs.length; i++) {
                _dicionario.setSubstantivos(_subs[i]);
            }
        }
        if (_verbos != null) {
            int i;
            for (i = 0; i < _subs.length; i++) {
                _dicionario.setVerbos(_verbos[i]);
            }
        }
        
    }
}
