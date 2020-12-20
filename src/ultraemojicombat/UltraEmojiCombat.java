package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {

        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Guilherme", "Brasil", 27, 1.70f, 70.9f, 12, 3, 1);
        lutador[1] = new Lutador("Ricardo", "França", 27, 1.70f, 70.9f, 12, 3, 1);
        lutador[2] = new Lutador("Gustavo", "Reino Unido", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[3] = new Lutador("Paulo", "Finlândia", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[4] = new Lutador("José", "Dinamarca", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[5] = new Lutador("Carlos", "Estados Unidos", 31, 1.75f, 68.9f, 11, 2, 1);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador[0], lutador[1]);
        UFC01.lutar();

    }
}
