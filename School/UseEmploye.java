package School;

public class UseEmploye {
    public static void main(String[] args) {
        Employe e=new Employe("Sohail",25);
        Employe f=new Employe("s2",26);
        Employe g=new Employe("s3",27);
        e.Show();
        f.Show();
        g.Show();

        e.ShowNextId();
        f.ShowNextId();
        g.ShowNextId();

    }
    
}
