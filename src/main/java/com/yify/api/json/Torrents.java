package com.yify.api.json;

public class Torrents
{
    private String date_uploaded;

    private String size_bytes;

    private String hash;

    private String date_uploaded_unix;

    private String peers;

    private String quality;

    private String seeds;

    private String download_count;

    private String url;

    private String size;

    public String getDate_uploaded ()
    {
        return date_uploaded;
    }

    public void setDate_uploaded (String date_uploaded)
    {
        this.date_uploaded = date_uploaded;
    }

    public String getSize_bytes ()
    {
        return size_bytes;
    }

    public void setSize_bytes (String size_bytes)
    {
        this.size_bytes = size_bytes;
    }

    public String getHash ()
    {
        return hash;
    }

    public void setHash (String hash)
    {
        this.hash = hash;
    }

    public String getDate_uploaded_unix ()
    {
        return date_uploaded_unix;
    }

    public void setDate_uploaded_unix (String date_uploaded_unix)
    {
        this.date_uploaded_unix = date_uploaded_unix;
    }

    public String getPeers ()
    {
        return peers;
    }

    public void setPeers (String peers)
    {
        this.peers = peers;
    }

    public String getQuality ()
    {
        return quality;
    }

    public void setQuality (String quality)
    {
        this.quality = quality;
    }

    public String getSeeds ()
    {
        return seeds;
    }

    public void setSeeds (String seeds)
    {
        this.seeds = seeds;
    }

    public String getDownload_count ()
    {
        return download_count;
    }

    public void setDownload_count (String download_count)
    {
        this.download_count = download_count;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date_uploaded = "+date_uploaded+", size_bytes = "+size_bytes+", hash = "+hash+", date_uploaded_unix = "+date_uploaded_unix+", peers = "+peers+", quality = "+quality+", seeds = "+seeds+", download_count = "+download_count+", url = "+url+", size = "+size+"]";
    }
}
