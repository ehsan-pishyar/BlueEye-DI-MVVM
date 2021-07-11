package com.example.blueeye.ui.main.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.blueeye.R

public class AboutMeFragmentDirections private constructor() {
  public companion object {
    public fun actionAboutMeFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_aboutMeFragment_to_searchFragment)
  }
}
