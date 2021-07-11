// Generated by Dagger (https://dagger.dev).
package com.example.blueeye.data.repository;

import com.example.blueeye.data.api.helper.WeatherServiceHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepository_Factory implements Factory<WeatherRepository> {
  private final Provider<WeatherServiceHelper> weatherServiceHelperProvider;

  public WeatherRepository_Factory(Provider<WeatherServiceHelper> weatherServiceHelperProvider) {
    this.weatherServiceHelperProvider = weatherServiceHelperProvider;
  }

  @Override
  public WeatherRepository get() {
    return newInstance(weatherServiceHelperProvider.get());
  }

  public static WeatherRepository_Factory create(
      Provider<WeatherServiceHelper> weatherServiceHelperProvider) {
    return new WeatherRepository_Factory(weatherServiceHelperProvider);
  }

  public static WeatherRepository newInstance(WeatherServiceHelper weatherServiceHelper) {
    return new WeatherRepository(weatherServiceHelper);
  }
}