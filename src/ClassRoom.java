public class ClassRoom {
    Pupil[] arrPupil;
    Pupil noInfo = new Pupil();

    public ClassRoom(Pupil excellent, Pupil good, Pupil bad, Pupil loser) {
      arrPupil = new Pupil[] {excellent, good, bad, loser};
    }

    public ClassRoom(Pupil excellent, Pupil good, Pupil bad) {
        this.arrPupil = new Pupil[] {excellent, good, bad, noInfo};
    }

    public ClassRoom(Pupil excellent, Pupil good) {
        this.arrPupil = new Pupil[] {excellent, good, noInfo, noInfo};

    }
}
