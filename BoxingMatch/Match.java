package BoxingMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {

        if (isStart()>50){
            Fighter temp;
            temp =this.f1;
            this.f1=this.f2;
            this.f2=temp;
        }

        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======== Yeni Raund=======");
                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);


                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }

            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı ! ");
            return true;
        }
        return false;
    }

    double isStart(){
        double randomNumber=Math.random()*100;
        return randomNumber;
    }
}
