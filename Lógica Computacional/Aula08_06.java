import javax.swing.JOptionPane;
 
class Main{
 String nome = "nome";
 
 public static void main(String[]args) {
  Main n = new Main();
   n.qqrcoisa();
 n.manipulaString();
 }
public void qqrcoisa(){
}
public void manipulaString(){
 nome = JOptionPane.showInputDialog("qual seu nome, coisa linda?");
 
 int suascartas = Integer.parseInt(JOptionPane.showInputDialog(nome+" quantas cartas você tem? "));
 int cartasadversárias = Integer.parseInt
 (JOptionPane.showInputDialog(nome+" quantas cartas o adversário tem ?"));
 
 if(suascartas == 0 && cartasadversárias != 0){
   nome = nome+" você ganhou o jogo! ";
 }
 else if(suascartas != 0 && cartasadversárias == 0){
   nome = nome+" o adversário ganhou o jogo! ";
 }
 else{
   manipulaString();
 }
 if(suascartas == 0 || cartasadversárias == 0){
 JOptionPane.showMessageDialog(null, nome);
 
 }
}
 
}
