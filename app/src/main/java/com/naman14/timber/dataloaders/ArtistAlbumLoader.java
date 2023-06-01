
package com.naman14.timber.dataloaders;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;

import com.naman14.timber.models.Album;
import com.naman14.timber.models.Song;

import java.util.ArrayList;
import java.util.List;

public class ArtistAlbumLoader {

    public static ArrayList<Album> getAlbumsForArtist(Context context, long artistID) {

        if (artistID == -1)
            return null;

        List<Album> allAlbums = AlbumLoader.getAllAlbums(context);
        ArrayList<Album> artistAlbums = new ArrayList<>();
        for (Album album: allAlbums) {
            if (album.artistId == artistID) {
                artistAlbums.add(album);
            }
        }
        return artistAlbums;
    }

}
