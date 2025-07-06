public class LibraryService {
    private LibraryRepository repository;

    public void setRepository(LibraryRepository repository) {
        this.repository = repository;
    }

    public void addBook() {
        repository.insert();
    }
}
