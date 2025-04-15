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
             sumPrice += book.getFinalPrice();
         }
        System.out.println(sumPrice);
        int countLanguage = getCountLanguage(books,"Java");
        System.out.println(countLanguage);
        int countCategory = getCountCategory(books,"Vien tuong 1");
        System.out.println(countCategory);
        getCountPrice(books,100);
    }

    private static void getCountPrice(Book[] books,int price) {
        int countPrice=0;
        for (Book book : books) {
            if(book.getPrice()>price&&book instanceof FictionBook) {
                countPrice++;
            }
        }
        System.out.println(countPrice);
    }

    private static int getCountCategory(Book[] books, String Category) {
        int countCategory = 0;
        for (Book book : books) {
            if(book instanceof FictionBook && ((FictionBook) book).getCategory()== Category) {
                countCategory++;
            }
        }
        return countCategory;
    }

    private static int getCountLanguage(Book[] books,String language) {
        int countLanguage = 0;
        for (Book book : books) {
            if( book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage()==language ) {
                countLanguage++;
            }
        }
        return countLanguage;
    }
}