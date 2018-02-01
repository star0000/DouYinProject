package com.example.douyinpro.home.bean;

import java.util.List;

/**
 * Created by 墨羽 on 2018/1/31.
 */

public class HomeBean {

    private ExtraBean extra;
    private int has_more;
    private int status_code;
    private int cursor;
    private int device_type;
    private List<CategoryListBean> category_list;

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public int getDevice_type() {
        return device_type;
    }

    public void setDevice_type(int device_type) {
        this.device_type = device_type;
    }

    public List<CategoryListBean> getCategory_list() {
        return category_list;
    }

    public void setCategory_list(List<CategoryListBean> category_list) {
        this.category_list = category_list;
    }

    public static class ExtraBean {
        /**
         * logid : 20180113093759010010052136074DCA
         * now : 1515807479614
         * fatal_item_ids : []
         */

        private String logid;
        private long now;
        private List<?> fatal_item_ids;

        public String getLogid() {
            return logid;
        }

        public void setLogid(String logid) {
            this.logid = logid;
        }

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public List<?> getFatal_item_ids() {
            return fatal_item_ids;
        }

        public void setFatal_item_ids(List<?> fatal_item_ids) {
            this.fatal_item_ids = fatal_item_ids;
        }
    }

    public static class CategoryListBean {

        private ChallengeInfoBean challenge_info;
        private String desc;
        private MusicInfoBean music_info;
        private List<AwemeListBean> aweme_list;

        public ChallengeInfoBean getChallenge_info() {
            return challenge_info;
        }

        public void setChallenge_info(ChallengeInfoBean challenge_info) {
            this.challenge_info = challenge_info;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public MusicInfoBean getMusic_info() {
            return music_info;
        }

        public void setMusic_info(MusicInfoBean music_info) {
            this.music_info = music_info;
        }

        public List<AwemeListBean> getAweme_list() {
            return aweme_list;
        }

        public void setAweme_list(List<AwemeListBean> aweme_list) {
            this.aweme_list = aweme_list;
        }

        public static class ChallengeInfoBean {
            /**
             * schema : aweme://aweme/challenge/detail?cid=1554127075368961
             * user_count : 2035
             * author : {}
             * cha_name : 皮卡丘
             * cid : 1554127075368961
             * type : 0
             * desc : 简单描述一下你的挑战
             */

            private String schema;
            private int user_count;
            private AuthorBean author;
            private String cha_name;
            private String cid;
            private int type;
            private String desc;

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getCha_name() {
                return cha_name;
            }

            public void setCha_name(String cha_name) {
                this.cha_name = cha_name;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public static class AuthorBean {
            }
        }

        public static class MusicInfoBean {

            private int status;
            private String owner_nickname;
            private String extra;
            private boolean is_original;
            private String offline_desc;
            private int source_platform;
            private AudioTrackBean audio_track;
            private CoverLargeBean cover_large;
            private int duration;
            private long id;
            private CoverThumbBean cover_thumb;
            private CoverHdBean cover_hd;
            private int user_count;
            private String title;
            private PlayUrlBean play_url;
            private EffectsDataBean effects_data;
            private String author;
            private String mid;
            private CoverMediumBean cover_medium;
            private String id_str;
            private String schema_url;
            private String owner_id;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getOwner_nickname() {
                return owner_nickname;
            }

            public void setOwner_nickname(String owner_nickname) {
                this.owner_nickname = owner_nickname;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public boolean isIs_original() {
                return is_original;
            }

            public void setIs_original(boolean is_original) {
                this.is_original = is_original;
            }

            public String getOffline_desc() {
                return offline_desc;
            }

            public void setOffline_desc(String offline_desc) {
                this.offline_desc = offline_desc;
            }

            public int getSource_platform() {
                return source_platform;
            }

            public void setSource_platform(int source_platform) {
                this.source_platform = source_platform;
            }

            public AudioTrackBean getAudio_track() {
                return audio_track;
            }

            public void setAudio_track(AudioTrackBean audio_track) {
                this.audio_track = audio_track;
            }

            public CoverLargeBean getCover_large() {
                return cover_large;
            }

            public void setCover_large(CoverLargeBean cover_large) {
                this.cover_large = cover_large;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public CoverThumbBean getCover_thumb() {
                return cover_thumb;
            }

            public void setCover_thumb(CoverThumbBean cover_thumb) {
                this.cover_thumb = cover_thumb;
            }

            public CoverHdBean getCover_hd() {
                return cover_hd;
            }

            public void setCover_hd(CoverHdBean cover_hd) {
                this.cover_hd = cover_hd;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public PlayUrlBean getPlay_url() {
                return play_url;
            }

            public void setPlay_url(PlayUrlBean play_url) {
                this.play_url = play_url;
            }

            public EffectsDataBean getEffects_data() {
                return effects_data;
            }

            public void setEffects_data(EffectsDataBean effects_data) {
                this.effects_data = effects_data;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public CoverMediumBean getCover_medium() {
                return cover_medium;
            }

            public void setCover_medium(CoverMediumBean cover_medium) {
                this.cover_medium = cover_medium;
            }

            public String getId_str() {
                return id_str;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public String getSchema_url() {
                return schema_url;
            }

            public void setSchema_url(String schema_url) {
                this.schema_url = schema_url;
            }

            public String getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(String owner_id) {
                this.owner_id = owner_id;
            }

            public static class AudioTrackBean {
                /**
                 * url_list : ["https://p3.pstatp.com/obj/4d540005e10e1761fc3e","https://pb9.pstatp.com/obj/4d540005e10e1761fc3e","https://pb3.pstatp.com/obj/4d540005e10e1761fc3e"]
                 * uri : 4d540005e10e1761fc3e
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverLargeBean {
                /**
                 * url_list : ["https://p3.pstatp.com/aweme/1080x1080/3b5b00045ab0c86a3c5b.jpeg","https://pb9.pstatp.com/aweme/1080x1080/3b5b00045ab0c86a3c5b.jpeg","https://pb3.pstatp.com/aweme/1080x1080/3b5b00045ab0c86a3c5b.jpeg"]
                 * uri : 3b5b00045ab0c86a3c5b
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverThumbBean {
                /**
                 * url_list : ["https://p3.pstatp.com/aweme/100x100/3b5b00045ab0c86a3c5b.jpeg","https://pb9.pstatp.com/aweme/100x100/3b5b00045ab0c86a3c5b.jpeg","https://pb3.pstatp.com/aweme/100x100/3b5b00045ab0c86a3c5b.jpeg"]
                 * uri : 3b5b00045ab0c86a3c5b
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverHdBean {
                /**
                 * url_list : ["https://p3.pstatp.com/aweme/1080x1080/3b5b00045ab0c86a3c5b.jpeg","https://pb9.pstatp.com/aweme/1080x1080/3b5b00045ab0c86a3c5b.jpeg","https://pb3.pstatp.com/aweme/1080x1080/3b5b00045ab0c86a3c5b.jpeg"]
                 * uri : 3b5b00045ab0c86a3c5b
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayUrlBean {
                /**
                 * url_list : ["http://p1.pstatp.com/obj/4d1d00046a8e1813a230","http://p9.pstatp.com/obj/4d1d00046a8e1813a230","http://p3.pstatp.com/obj/4d1d00046a8e1813a230"]
                 * uri : 4d1d00046a8e1813a230
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class EffectsDataBean {
                /**
                 * url_list : ["https://p1.pstatp.com/obj/4d540005e131e9ac907a","https://pb3.pstatp.com/obj/4d540005e131e9ac907a","https://pb3.pstatp.com/obj/4d540005e131e9ac907a"]
                 * uri : 4d540005e131e9ac907a
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverMediumBean {
                /**
                 * url_list : ["https://p3.pstatp.com/aweme/720x720/3b5b00045ab0c86a3c5b.jpeg","https://pb9.pstatp.com/aweme/720x720/3b5b00045ab0c86a3c5b.jpeg","https://pb3.pstatp.com/aweme/720x720/3b5b00045ab0c86a3c5b.jpeg"]
                 * uri : 3b5b00045ab0c86a3c5b
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class AwemeListBean {

            private LabelTopBean label_top;
            private long author_user_id;
            private int rate;
            private int create_time;
            private VideoBean video;
            private String aweme_id;
            private boolean is_vr;
            private int vr_type;
            private StatisticsBean statistics;
            private String share_url;
            private boolean is_ads;
            private int bodydance_score;
            private int is_hash_tag;
            private StatusBean status;
            private ShareInfoBean share_info;
            private int is_top;
            private int aweme_type;
            private String desc;
            private String region;
            private int user_digged;
            private LabelLargeBean label_large;
            private LabelThumbBean label_thumb;
            private List<?> video_labels;
            private List<?> text_extra;

            public LabelTopBean getLabel_top() {
                return label_top;
            }

            public void setLabel_top(LabelTopBean label_top) {
                this.label_top = label_top;
            }

            public long getAuthor_user_id() {
                return author_user_id;
            }

            public void setAuthor_user_id(long author_user_id) {
                this.author_user_id = author_user_id;
            }

            public int getRate() {
                return rate;
            }

            public void setRate(int rate) {
                this.rate = rate;
            }

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public VideoBean getVideo() {
                return video;
            }

            public void setVideo(VideoBean video) {
                this.video = video;
            }

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public boolean isIs_vr() {
                return is_vr;
            }

            public void setIs_vr(boolean is_vr) {
                this.is_vr = is_vr;
            }

            public int getVr_type() {
                return vr_type;
            }

            public void setVr_type(int vr_type) {
                this.vr_type = vr_type;
            }

            public StatisticsBean getStatistics() {
                return statistics;
            }

            public void setStatistics(StatisticsBean statistics) {
                this.statistics = statistics;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public boolean isIs_ads() {
                return is_ads;
            }

            public void setIs_ads(boolean is_ads) {
                this.is_ads = is_ads;
            }

            public int getBodydance_score() {
                return bodydance_score;
            }

            public void setBodydance_score(int bodydance_score) {
                this.bodydance_score = bodydance_score;
            }

            public int getIs_hash_tag() {
                return is_hash_tag;
            }

            public void setIs_hash_tag(int is_hash_tag) {
                this.is_hash_tag = is_hash_tag;
            }

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
            }

            public ShareInfoBean getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBean share_info) {
                this.share_info = share_info;
            }

            public int getIs_top() {
                return is_top;
            }

            public void setIs_top(int is_top) {
                this.is_top = is_top;
            }

            public int getAweme_type() {
                return aweme_type;
            }

            public void setAweme_type(int aweme_type) {
                this.aweme_type = aweme_type;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public int getUser_digged() {
                return user_digged;
            }

            public void setUser_digged(int user_digged) {
                this.user_digged = user_digged;
            }

            public LabelLargeBean getLabel_large() {
                return label_large;
            }

            public void setLabel_large(LabelLargeBean label_large) {
                this.label_large = label_large;
            }

            public LabelThumbBean getLabel_thumb() {
                return label_thumb;
            }

            public void setLabel_thumb(LabelThumbBean label_thumb) {
                this.label_thumb = label_thumb;
            }

            public List<?> getVideo_labels() {
                return video_labels;
            }

            public void setVideo_labels(List<?> video_labels) {
                this.video_labels = video_labels;
            }

            public List<?> getText_extra() {
                return text_extra;
            }

            public void setText_extra(List<?> text_extra) {
                this.text_extra = text_extra;
            }

            public static class LabelTopBean {
                /**
                 * url_list : ["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"]
                 * uri : c150000f34767e2cb56
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class VideoBean {

                private String ratio;
                private boolean has_watermark;
                private PlayAddrBean play_addr;
                private CoverBean cover;
                private int height;
                private int width;
                private DownloadAddrBean download_addr;
                private OriginCoverBean origin_cover;
                private PlayAddrLowbrBean play_addr_lowbr;
                private DynamicCoverBean dynamic_cover;

                public String getRatio() {
                    return ratio;
                }

                public void setRatio(String ratio) {
                    this.ratio = ratio;
                }

                public boolean isHas_watermark() {
                    return has_watermark;
                }

                public void setHas_watermark(boolean has_watermark) {
                    this.has_watermark = has_watermark;
                }

                public PlayAddrBean getPlay_addr() {
                    return play_addr;
                }

                public void setPlay_addr(PlayAddrBean play_addr) {
                    this.play_addr = play_addr;
                }

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public DownloadAddrBean getDownload_addr() {
                    return download_addr;
                }

                public void setDownload_addr(DownloadAddrBean download_addr) {
                    this.download_addr = download_addr;
                }

                public OriginCoverBean getOrigin_cover() {
                    return origin_cover;
                }

                public void setOrigin_cover(OriginCoverBean origin_cover) {
                    this.origin_cover = origin_cover;
                }

                public PlayAddrLowbrBean getPlay_addr_lowbr() {
                    return play_addr_lowbr;
                }

                public void setPlay_addr_lowbr(PlayAddrLowbrBean play_addr_lowbr) {
                    this.play_addr_lowbr = play_addr_lowbr;
                }

                public DynamicCoverBean getDynamic_cover() {
                    return dynamic_cover;
                }

                public void setDynamic_cover(DynamicCoverBean dynamic_cover) {
                    this.dynamic_cover = dynamic_cover;
                }

                public static class PlayAddrBean {
                    /**
                     * url_list : ["https://aweme.snssdk.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=0&ratio=720p&media_type=4&vr_type=0","https://api.amemv.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=1&ratio=720p&media_type=4&vr_type=0","https://api.amemv.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=1&ratio=720p&media_type=4&vr_type=0"]
                     * uri : 8e881a1a50ca4b43a79fe38dc277023c
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class CoverBean {
                    /**
                     * url_list : ["https://p9.pstatp.com/aweme/300x400/3f3f0004dd1ec3e3f4d6.jpeg","https://pb1.pstatp.com/aweme/300x400/3f3f0004dd1ec3e3f4d6.jpeg","https://pb3.pstatp.com/aweme/300x400/3f3f0004dd1ec3e3f4d6.jpeg"]
                     * uri : 300x400/3f3f0004dd1ec3e3f4d6
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class DownloadAddrBean {
                    /**
                     * url_list : ["https://aweme.snssdk.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://api.amemv.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0","https://api.amemv.com/aweme/v1/play/?video_id=8e881a1a50ca4b43a79fe38dc277023c&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"]
                     * uri : 8e881a1a50ca4b43a79fe38dc277023c
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class OriginCoverBean {

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class PlayAddrLowbrBean {

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class DynamicCoverBean {
                    /**
                     * url_list : ["https://p1.pstatp.com/obj/3f4100024b60e3aaab48","https://pb3.pstatp.com/obj/3f4100024b60e3aaab48","https://pb3.pstatp.com/obj/3f4100024b60e3aaab48"]
                     * uri : 3f4100024b60e3aaab48
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }

            public static class StatisticsBean {
                /**
                 * play_count : 10832100
                 * aweme_id : 6476680591260519694
                 * comment_count : 6951
                 * share_count : 50958
                 * digg_count : 569336
                 */

                private int play_count;
                private String aweme_id;
                private int comment_count;
                private int share_count;
                private int digg_count;

                public int getPlay_count() {
                    return play_count;
                }

                public void setPlay_count(int play_count) {
                    this.play_count = play_count;
                }

                public String getAweme_id() {
                    return aweme_id;
                }

                public void setAweme_id(String aweme_id) {
                    this.aweme_id = aweme_id;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getShare_count() {
                    return share_count;
                }

                public void setShare_count(int share_count) {
                    this.share_count = share_count;
                }

                public int getDigg_count() {
                    return digg_count;
                }

                public void setDigg_count(int digg_count) {
                    this.digg_count = digg_count;
                }
            }

            public static class StatusBean {
                /**
                 * allow_share : true
                 * allow_comment : true
                 * with_goods : false
                 * is_private : false
                 * is_delete : false
                 */

                private boolean allow_share;
                private boolean allow_comment;
                private boolean with_goods;
                private boolean is_private;
                private boolean is_delete;

                public boolean isAllow_share() {
                    return allow_share;
                }

                public void setAllow_share(boolean allow_share) {
                    this.allow_share = allow_share;
                }

                public boolean isAllow_comment() {
                    return allow_comment;
                }

                public void setAllow_comment(boolean allow_comment) {
                    this.allow_comment = allow_comment;
                }

                public boolean isWith_goods() {
                    return with_goods;
                }

                public void setWith_goods(boolean with_goods) {
                    this.with_goods = with_goods;
                }

                public boolean isIs_private() {
                    return is_private;
                }

                public void setIs_private(boolean is_private) {
                    this.is_private = is_private;
                }

                public boolean isIs_delete() {
                    return is_delete;
                }

                public void setIs_delete(boolean is_delete) {
                    this.is_delete = is_delete;
                }
            }

            public static class ShareInfoBean {
                /**
                 * share_weibo_desc : #抖音上瘾# @抖音玩家 发了一个抖音短视频，你尽管点开，不好看算我输！戳这里>>
                 * share_title : @抖音玩家发了一个抖音短视频，你尽管点开，不好看算我输！
                 * share_url : https://www.douyin.com/share/video/6476680591260519694/?region=CN&mid=6324514960806251265
                 * share_desc : 抖音-原创音乐短视频社区
                 */

                private String share_weibo_desc;
                private String share_title;
                private String share_url;
                private String share_desc;

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }
            }

            public static class LabelLargeBean {
                /**
                 * url_list : ["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"]
                 * uri : 330b000f63e3bf11a1f3
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class LabelThumbBean {
                /**
                 * url_list : ["https://p1.pstatp.com/obj/2efe004a4a7dc47b3bc2","https://pb3.pstatp.com/obj/2efe004a4a7dc47b3bc2","https://pb3.pstatp.com/obj/2efe004a4a7dc47b3bc2"]
                 * uri : 2efe004a4a7dc47b3bc2
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }
    }

}

