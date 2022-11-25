package io.github.snap;


public interface MarvelSnap4j {

    /**
     * returns new Builder instance
     *
     * @return Builder instance
     */
    static MarvelSnap4jBuilder newBuilder() {
        return new MarvelSnap4jBuilder();
    }

    /**
     * equivalent to calling newBuilder().build();
     *
     * @return MarvelSnap4j Instance
     */
    static MarvelSnap4jImpl getInstance() {
        return newBuilder().build();
    }

    class MarvelSnap4jBuilder {

        public MarvelSnap4jImpl build() {
            return new MarvelSnap4jImpl();
        }
    }
}
