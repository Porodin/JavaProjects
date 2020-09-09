public class ClassRoom {
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupil1.study();
        pupil2.read();
        pupil3.write();
        pupil4.relax();
    }


    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();

    }
}
