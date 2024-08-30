package com.example.musicapppinnacle

import androidx.annotation.DrawableRes

data class LibraryData(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<LibraryData>(
    LibraryData(R.drawable.ic_playlist_green, "Playlist"),
    LibraryData(R.drawable.ic_microphone, "Artists"),
    LibraryData(R.drawable.ic_baseline_album_24, "Album"),
    LibraryData(R.drawable.ic_baseline_music_note_24, "Songs"),
    LibraryData(R.drawable.ic_genre, "Genre")
)
