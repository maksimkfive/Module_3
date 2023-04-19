package task1;

abstract class Metal {
    public abstract int getEndurance();
}

class Steel extends Metal {
    @Override
    public int getEndurance() {
        return 50;
    }
}

class Copper extends Metal {
    @Override
    public int getEndurance() {
        return 20;
    }
}

class Iron extends Metal {
    @Override
    public int getEndurance() {
        return 30;
    }
}

class Plastic {}

class Sword<M extends Metal> {
    private M material;

    public Sword(M material) {
        this.material = material;
    }

    public boolean isStrong() {
        return material.getEndurance() > 49;
    }
}

public class Test {
    public static void main(String[] args) {
        // Нельзя создать меч из пластика
        // Sword<Plastic> plasticSword = new Sword<>(new Plastic());

        // Создаем меч из стали
        Sword<Steel> steelSword = new Sword<>(new Steel());

        // Проверяем прочность меча из стали
        if (steelSword.isStrong()) {
            System.out.println("Меч из стали прошел проверку прочности");
        } else {
            System.out.println("Меч из стали не прошел проверку прочности");
        }
    }
}

