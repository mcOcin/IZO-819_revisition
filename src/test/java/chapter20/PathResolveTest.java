package chapter20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class PathResolveTest {

    @Test
    void twoAbsolutePaths_resolve_idk() {
        Path firstAbsolutePath = Path.of("/nico/test");
        Path secondAbsolutePath = Path.of("/pauline/test");

        // When resolve with two absolutes paths then the resolve param is returned.
        assertThat(firstAbsolutePath.resolve(secondAbsolutePath).toString()).isEqualTo("\\pauline\\test");
    }

    @Test
    void absoluteAndNonAbsolutePath_isAbsolute_trueOrFalse() {
        Path nonAbsolute = Path.of("nonAbsolute/path/file.txt");
        Path absolute = Path.of("C:/from/root");

        assertThat(nonAbsolute.isAbsolute()).isFalse();
        assertThat(absolute.isAbsolute()).isTrue();
    }

    @Test
    void nonExistingFilePath_toAbsolute_notFound() {
        Path nonAbsolute = Path.of("nonAbsolute/path/file.txt");

        // Even is path is not existing toAbsolute will concat the project path as root.
        assertThat(nonAbsolute.toAbsolutePath()).isNotNull();
    }
}
