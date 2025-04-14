//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("St1","Lap trinh co ban",120,"Thomas","Java","Java");
        books[1] = new ProgrammingBook("St02","Lap trinh trung cap",110,"Dan","Java","Visual studio");
        books[2] = new ProgrammingBook("St03","lap trinh cao cap",120,"Katie","C#","Visual studio");
        books[3] = new FictionBook("St04","Bay cuu",90,"Hoang","Vien tuong 1");
        books[4] = new FictionBook("st05","Hoa",80,"Lan","Vien tuong 1");
        books[5] = new FictionBook("St6","Last Rose",120,"Melanie","Vien tuong 2");
         int sumPrice = 0;
         for (Book book : books) {
             sumPrice += book.getPrice();
         }
        System.out.println(sumPrice);
         int countLanguage = 0;
         for (Book book : books) {
             if( book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage()=="Java" && ((ProgrammingBook) book).getLanguage()=="Java" ) {
                 countLanguage++;
             }
         }
         System.out.println(countLanguage);
         int countCategory = 0;
         for (Book book : books) {
             if(book instanceof FictionBook && ((FictionBook) book).getCategory()=="Vien tuong 1") {
                 countCategory++;
             }
         }
        System.out.println(countCategory);
         int countPrice=0;
         for (Book book : books) {
             if(book.getPrice()>100&&book instanceof FictionBook) {
                 countPrice++;
             }
         }
         System.out.println(countPrice);
    }
}