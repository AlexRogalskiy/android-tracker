package org.owntracks.android.geocoding;

import androidx.collection.LruCache;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H$J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016R.\u0010\u0003\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lorg/owntracks/android/geocoding/CachingGeocoder;", "Lorg/owntracks/android/geocoding/Geocoder;", "()V", "cache", "Landroidx/collection/LruCache;", "Lkotlin/Pair;", "", "", "getCache", "()Landroidx/collection/LruCache;", "doLookup", "latitude", "longitude", "reverse", "app_debug"})
public abstract class CachingGeocoder implements org.owntracks.android.geocoding.Geocoder {
    @org.jetbrains.annotations.NotNull()
    private final androidx.collection.LruCache<kotlin.Pair<java.lang.Double, java.lang.Double>, java.lang.String> cache = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.collection.LruCache<kotlin.Pair<java.lang.Double, java.lang.Double>, java.lang.String> getCache() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String reverse(double latitude, double longitude) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.String doLookup(double latitude, double longitude);
    
    public CachingGeocoder() {
        super();
    }
}