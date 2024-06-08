package com.example.lab8_ph39815.data

import com.google.gson.annotations.SerializedName
import kotlin.collections.listOf


data class Movie(
    @SerializedName("filmId") val id: String,
    @SerializedName("filmName") val filmName: String,
    @SerializedName("duration") val duration: String,
    @SerializedName("releaseDate") val releaseDate: String,
    @SerializedName("genre") val genre: String,
    @SerializedName("national") val national: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String,
)

//{
//    companion object {
//        fun getSampleMovies(): List<Movie> {
//            return listOf(
//                Movie(
//                    "1",
//                    "Vay ham ke trung phat",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng. " +
//                            "Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/4/0/406x600-roundup_1.jpg"
//                ),
//                Movie(
//                    "2",
//                    "Hanh tinh khi ",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng." +
//                            " Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/hanh-tinh-khi-vuong-quoc-moi/hanh-tinh-khi-vuong-quoc-moi-thumb.jpg"
//                ),
//                Movie(
//                    "3",
//                    "XMen97 ",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng." +
//                            " Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/x-men-97/x-men-97-thumb.jpg"
//                ),
//                Movie(
//                    "4",
//                    "KUNG FU PANDA 4",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng." +
//                            " Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/kung-fu-panda-4/kung-fu-panda-4-thumb.jpg"
//                ),
//                Movie(
//                    "5",
//                    "GODZILLA X KONG: ĐẾ CHẾ MỚI",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng. " +
//                            "Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/godzilla-x-kong-de-che-moi/godzilla-x-kong-de-che-moi-thumb.jpg"
//                ),
//                Movie(
//                    "6",
//                    "QUỶ CẨU",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng." +
//                            " Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/quy-cau/quy-cau-thumb.jpg"
//                ),
//                Movie(
//                    "7",
//                    "HELLKAT",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "HellKat là một bộ phim hành động kịch tính do đạo diễn Scott Jeffrey chỉ đạo. " +
//                            "Cốt truyện của phim xoay quanh cuộc sống của một võ sĩ MMA đã rơi vào tình trạng thất bại và buồn tẻ sau khi thiệt mạng trong một trận đấu. " +
//                            "Tuy nhiên, cuộc sống của anh ta thay đổi hoàn toàn khi anh ta nhận được cơ hội duy nhất để cứu linh hồn người phụ nữ anh yêu. " +
//                            "Với ý chí kiên cường và quyết tâm không ngừng, võ sĩ MMA đã chấp nhận tham gia vào một giải đấu chết do Netherworld Holds-Barred tổ chức. " +
//                            "Trong giải đấu này, anh ta sẽ phải chiến đấu với không chỉ con người, mà còn cả các sinh vật man rợ, quái vật và ác quỷ. " +
//                            "Mục tiêu của anh ta là giành chiến thắng để có thể cứu linh hồn người phụ nữ anh yêu khỏi cái chết. Nhân vật chính trong HellKat là một võ sĩ MMA tài ba và kiên cường. " +
//                            "Anh ta đã từng lập nên kỳ tích trong sự nghiệp của mình trước khi gặp tai nạn không may. " +
//                            "Nhưng sự mất mát đã thúc đẩy anh ta tìm kiếm cơ hội để rửa tội và cứu vãn tình yêu của mình. " +
//                            "Với khả năng chiến đấu vượt trội, anh ta quyết định đối mặt với những thử thách nguy hiểm trong giải đấu chết này. " +
//                            "Với những pha hành động mãn nhãn, những trận chiến căng thẳng và không kém phần kịch tính, HellKat hứa hẹn sẽ mang lại cho khán giả những phút giây giải trí tuyệt vời. " +
//                            "Bộ phim là sự kết hợp hoàn hảo giữa võ thuật và yếu tố siêu nhiên, mang lại cho người xem cảm giác căng thẳng và hồi hộp từ đầu đến cuối.",
//                    "https://vn.phimmoitv.org/storage/images/hellkat/hellkat-thumb.jpg"
//                ),
//                Movie(
//                    "8",
//                    "NGƯỜI HOBBIT: ĐẠI CHIẾN 5 CÁNH QUÂN",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Bộ phim \"Sấm Nhiệt Đới\" kể về một nhóm diễn viên ích kỷ và tự cho mình là trung tâm của sự chú ý. " +
//                            "Họ quyết định thực hiện một bộ phim chiến tranh với ngân sách lớn nhất từ trước đến nay. " +
//                            "Tuy nhiên, khi ngân sách tiếp tục tăng cao, hãng phim quyết định hoãn lại dự án này. " +
//                            "Đạo diễn của bộ phim không cam lòng với quyết định này và vẫn kiên quyết tiếp tục quay phim. " +
//                            "Cả đoàn làm phim sau đó nhập vào khu rừng rậm ở Đông Nam Á và bất ngờ trở thành những người lính thật sự trong cuộc chiến. " +
//                            "Ben Stiller, Jack Black, Robert Downey Jr., cùng với Ben Stiller chính là những diễn viên chính trong bộ phim này.",
//                    "https://vn.phimmoitv.org/storage/images/sam-nhiet-doi/sam-nhiet-doi-thumb.jpg"
//                ),
//                Movie(
//                    "9",
//                    "GODZILLA X KONG: ĐẾ CHẾ MỚI",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng. " +
//                            "Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/godzilla-x-kong-de-che-moi/godzilla-x-kong-de-che-moi-thumb.jpg"
//                ),
//                Movie(
//                    "10",
//                    "QUỶ CẨU",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Po đang chuẩn bị trở thành thủ lĩnh tinh thần của Thung lũng Hòa bình của mình, nhưng cũng cần một người thay thế anh ấy làm Chiến binh Rồng." +
//                            " Vì vậy, anh ta sẽ huấn luyện một học viên kung fu mới tại chỗ và sẽ chạm trán với một nhân vật phản diện tên là Tắc kè hoa, kẻ gợi lên những nhân vật phản diện trong quá khứ.",
//                    "https://vn.phimmoitv.org/storage/images/quy-cau/quy-cau-thumb.jpg"
//                ),
//                Movie(
//                    "11",
//                    "HELLKAT",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "HellKat là một bộ phim hành động kịch tính do đạo diễn Scott Jeffrey chỉ đạo. " +
//                            "Cốt truyện của phim xoay quanh cuộc sống của một võ sĩ MMA đã rơi vào tình trạng thất bại và buồn tẻ sau khi thiệt mạng trong một trận đấu. " +
//                            "Tuy nhiên, cuộc sống của anh ta thay đổi hoàn toàn khi anh ta nhận được cơ hội duy nhất để cứu linh hồn người phụ nữ anh yêu. " +
//                            "Với ý chí kiên cường và quyết tâm không ngừng, võ sĩ MMA đã chấp nhận tham gia vào một giải đấu chết do Netherworld Holds-Barred tổ chức. " +
//                            "Trong giải đấu này, anh ta sẽ phải chiến đấu với không chỉ con người, mà còn cả các sinh vật man rợ, quái vật và ác quỷ. " +
//                            "Mục tiêu của anh ta là giành chiến thắng để có thể cứu linh hồn người phụ nữ anh yêu khỏi cái chết. Nhân vật chính trong HellKat là một võ sĩ MMA tài ba và kiên cường. " +
//                            "Anh ta đã từng lập nên kỳ tích trong sự nghiệp của mình trước khi gặp tai nạn không may. " +
//                            "Nhưng sự mất mát đã thúc đẩy anh ta tìm kiếm cơ hội để rửa tội và cứu vãn tình yêu của mình. " +
//                            "Với khả năng chiến đấu vượt trội, anh ta quyết định đối mặt với những thử thách nguy hiểm trong giải đấu chết này. " +
//                            "Với những pha hành động mãn nhãn, những trận chiến căng thẳng và không kém phần kịch tính, HellKat hứa hẹn sẽ mang lại cho khán giả những phút giây giải trí tuyệt vời. " +
//                            "Bộ phim là sự kết hợp hoàn hảo giữa võ thuật và yếu tố siêu nhiên, mang lại cho người xem cảm giác căng thẳng và hồi hộp từ đầu đến cuối.",
//                    "https://vn.phimmoitv.org/storage/images/hellkat/hellkat-thumb.jpg"
//                ),
//                Movie(
//                    "12",
//                    "NGƯỜI HOBBIT: ĐẠI CHIẾN 5 CÁNH QUÂN",
//                    "180 minutes",
//                    "25/02/2024",
//                    "Hang dong, Khoa hoc , Vien tuong",
//                    "Hàn Quoc",
//                    "Bộ phim \"Sấm Nhiệt Đới\" kể về một nhóm diễn viên ích kỷ và tự cho mình là trung tâm của sự chú ý. " +
//                            "Họ quyết định thực hiện một bộ phim chiến tranh với ngân sách lớn nhất từ trước đến nay. " +
//                            "Tuy nhiên, khi ngân sách tiếp tục tăng cao, hãng phim quyết định hoãn lại dự án này. " +
//                            "Đạo diễn của bộ phim không cam lòng với quyết định này và vẫn kiên quyết tiếp tục quay phim. " +
//                            "Cả đoàn làm phim sau đó nhập vào khu rừng rậm ở Đông Nam Á và bất ngờ trở thành những người lính thật sự trong cuộc chiến. " +
//                            "Ben Stiller, Jack Black, Robert Downey Jr., cùng với Ben Stiller chính là những diễn viên chính trong bộ phim này.",
//                    "https://vn.phimmoitv.org/storage/images/sam-nhiet-doi/sam-nhiet-doi-thumb.jpg"
//                )
//            )
//        }
//    }
//}
