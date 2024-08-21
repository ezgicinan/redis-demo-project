package ec.redis_demo_project.util;

public enum CacheNames {
    RECIPE_TITLES("recipeTitles");

    public final String cacheName;

    private CacheNames(String cacheName) {
        this.cacheName = cacheName;
    }

    public static String valueOfCacheName(String cacheName) {
        for (CacheNames name : values()) {
            if (name.cacheName.equals(cacheName)) {
                return name.cacheName;
            }
        }
        return null;
    }
}