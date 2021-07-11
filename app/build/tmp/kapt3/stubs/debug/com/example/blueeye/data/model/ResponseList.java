package com.example.blueeye.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0015H\u00c6\u0003J\t\u00103\u001a\u00020\u0017H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\fH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u00109\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\t\u0010:\u001a\u00020\u0011H\u00c6\u0003J\t\u0010;\u001a\u00020\u0013H\u00c6\u0003J\u0086\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020BH\u00d6\u0001J\t\u0010C\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100\u00a8\u0006D"}, d2 = {"Lcom/example/blueeye/data/model/ResponseList;", "", "dt", "", "main", "Lcom/example/blueeye/data/model/Main;", "weather", "", "Lcom/example/blueeye/data/model/Weather;", "clouds", "Lcom/example/blueeye/data/model/Clouds;", "wind", "Lcom/example/blueeye/data/model/Wind;", "visibility", "pop", "", "rain", "Lcom/example/blueeye/data/model/Rain;", "sys", "Lcom/example/blueeye/data/model/Sys;", "dtText", "", "city", "Lcom/example/blueeye/data/model/City;", "(JLcom/example/blueeye/data/model/Main;Ljava/util/List;Lcom/example/blueeye/data/model/Clouds;Lcom/example/blueeye/data/model/Wind;Ljava/lang/Long;Ljava/lang/Double;Lcom/example/blueeye/data/model/Rain;Lcom/example/blueeye/data/model/Sys;Ljava/lang/String;Lcom/example/blueeye/data/model/City;)V", "getCity", "()Lcom/example/blueeye/data/model/City;", "getClouds", "()Lcom/example/blueeye/data/model/Clouds;", "getDt", "()J", "getDtText", "()Ljava/lang/String;", "getMain", "()Lcom/example/blueeye/data/model/Main;", "getPop", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain", "()Lcom/example/blueeye/data/model/Rain;", "getSys", "()Lcom/example/blueeye/data/model/Sys;", "getVisibility", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/blueeye/data/model/Wind;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLcom/example/blueeye/data/model/Main;Ljava/util/List;Lcom/example/blueeye/data/model/Clouds;Lcom/example/blueeye/data/model/Wind;Ljava/lang/Long;Ljava/lang/Double;Lcom/example/blueeye/data/model/Rain;Lcom/example/blueeye/data/model/Sys;Ljava/lang/String;Lcom/example/blueeye/data/model/City;)Lcom/example/blueeye/data/model/ResponseList;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ResponseList {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.blueeye.data.model.Main main = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.blueeye.data.model.Weather> weather = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final com.example.blueeye.data.model.Clouds clouds = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.blueeye.data.model.Wind wind = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final java.lang.Long visibility = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pop")
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "rain")
    private final com.example.blueeye.data.model.Rain rain = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.blueeye.data.model.Sys sys = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "dt_text")
    private final java.lang.String dtText = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private final com.example.blueeye.data.model.City city = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.ResponseList copy(long dt, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Main main, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blueeye.data.model.Weather> weather, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Clouds clouds, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Wind wind, @org.jetbrains.annotations.Nullable()
    java.lang.Long visibility, @org.jetbrains.annotations.Nullable()
    java.lang.Double pop, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Rain rain, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Sys sys, @org.jetbrains.annotations.NotNull()
    java.lang.String dtText, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.City city) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponseList(long dt, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Main main, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blueeye.data.model.Weather> weather, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Clouds clouds, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Wind wind, @org.jetbrains.annotations.Nullable()
    java.lang.Long visibility, @org.jetbrains.annotations.Nullable()
    java.lang.Double pop, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Rain rain, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.Sys sys, @org.jetbrains.annotations.NotNull()
    java.lang.String dtText, @org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.model.City city) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Main component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.blueeye.data.model.Weather> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.blueeye.data.model.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Clouds component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Wind component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Rain component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Sys component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDtText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.City component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blueeye.data.model.City getCity() {
        return null;
    }
}