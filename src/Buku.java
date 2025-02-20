        class book{
            int pages;
            int prices;
            
        public void set (int prices, int pages){
            this.prices=prices;
            this.pages=pages;
        }    
            public void show(){
                System.out.println("books information");
                System.out.println("books price: "+prices);
                System.out.println("number of pages: "+pages);
            }
        }    
        public class Buku {
            public static void main(String[]args){
            book javabook = new book();
            javabook.set(60000, 100);
            javabook.show();
        }
        }
        