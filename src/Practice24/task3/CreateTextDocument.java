package Practice24.task3;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateOpen() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }
}
