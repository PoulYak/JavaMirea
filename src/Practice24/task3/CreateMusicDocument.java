package Practice24.task3;

public class CreateMusicDocument implements ICreateDocument{
    @Override
    public IDocument CreateOpen() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }
}
