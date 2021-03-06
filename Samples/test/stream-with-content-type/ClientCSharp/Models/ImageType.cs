// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace StreamWithContentType.Models
{
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using System.Runtime;
    using System.Runtime.Serialization;

    /// <summary>
    /// Defines values for ImageType.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ImageType
    {
        [EnumMember(Value = "image/gif")]
        ImageGif,
        [EnumMember(Value = "image/jpeg")]
        ImageJpeg,
        [EnumMember(Value = "image/png")]
        ImagePng,
        [EnumMember(Value = "image/bmp")]
        ImageBmp,
        [EnumMember(Value = "image/tiff")]
        ImageTiff
    }
    internal static class ImageTypeEnumExtension
    {
        internal static string ToSerializedValue(this ImageType? value)
        {
            return value == null ? null : ((ImageType)value).ToSerializedValue();
        }

        internal static string ToSerializedValue(this ImageType value)
        {
            switch( value )
            {
                case ImageType.ImageGif:
                    return "image/gif";
                case ImageType.ImageJpeg:
                    return "image/jpeg";
                case ImageType.ImagePng:
                    return "image/png";
                case ImageType.ImageBmp:
                    return "image/bmp";
                case ImageType.ImageTiff:
                    return "image/tiff";
            }
            return null;
        }

        internal static ImageType? ParseImageType(this string value)
        {
            switch( value )
            {
                case "image/gif":
                    return ImageType.ImageGif;
                case "image/jpeg":
                    return ImageType.ImageJpeg;
                case "image/png":
                    return ImageType.ImagePng;
                case "image/bmp":
                    return ImageType.ImageBmp;
                case "image/tiff":
                    return ImageType.ImageTiff;
            }
            return null;
        }
    }
}
