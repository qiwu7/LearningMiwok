package com.example.android.miwok;

/**
 * Created by mscec on 2017/8/8.
 */

public class Word {
    //default translation for the word
    private String defaultTranslation;
    //miwok translation for the word
    private String miwokTranslation;

    private int imageSourceId;

    private int audioSourceId;

    private final static int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int imageSourceId, int audioSourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageSourceId = imageSourceId;
        this.audioSourceId = audioSourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioSourceId) {
        this(defaultTranslation, miwokTranslation, NO_IMAGE_PROVIDED, audioSourceId);
    }

    public String getDefaultTranslation() {
        return this.defaultTranslation;
    }

    public String getMiwokTranslation() {
        return this.miwokTranslation;
    }

    public int getImageSourceId() {
        return this.imageSourceId;
    }

    public int getAudioSourceId() {
        return this.audioSourceId;
    }

    public boolean hasImage() {
        return this.imageSourceId != NO_IMAGE_PROVIDED;
    }
}
