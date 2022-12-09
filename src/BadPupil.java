public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.print("studies bad, ");
    }
    @Override
    void read() {
        System.out.print("studies bad, ");
    }
    @Override
    void write() {
        System.out.print("writes bad, ");
    }
    @Override
    void relax() {
        System.out.print("relaxes bad.\n");
    }
    @Override
    void info () {
    }
}
