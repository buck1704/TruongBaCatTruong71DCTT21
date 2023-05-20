CREATE DATABASE dbTruongBaCatTruong71DCTT21
USE [dbTruongBaCatTruong71DCTT21]
GO
/****** Object:  Table [dbo].[book]    Script Date: 5/20/2023 5:49:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[book](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tensach] [nvarchar](250) NOT NULL,
	[theloai] [nvarchar](50) NOT NULL,
	[namxuatban] [int] NOT NULL,
	[ngaynhap] [date] NOT NULL,
	[giatien] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[users]    Script Date: 5/20/2023 5:49:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[taikhoan] [nvarchar](100) NOT NULL,
	[matkhau] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[book] ON 

INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (1, N'Cuộc phiêu lưu của Alice', N'Phiêu lưu', 1865, CAST(N'2022-01-01' AS Date), N'100000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (2, N'Tôi là Legend', N'Kinh dị', 1954, CAST(N'2022-02-15' AS Date), N'150000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (3, N'Truyện Kiều', N'Kinh điển', 1820, CAST(N'2022-03-10' AS Date), N'120000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (4, N'Số Đỏ', N'Chính trị', 1936, CAST(N'2022-04-20' AS Date), N'90000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (5, N'Dế Mèn Phiêu Lưu Ký', N'Phiêu lưu', 2001, CAST(N'2022-05-05' AS Date), N'80000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (6, N'Harry Potter và Hòn Đá Phù Thủy', N'Phiêu lưu', 1997, CAST(N'2022-06-12' AS Date), N'110000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (7, N'Đắc Nhân Tâm', N'Tự giúp bản thân', 1936, CAST(N'2022-07-25' AS Date), N'100000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (8, N'Ngày xưa có một chuyện tình', N'Tình cảm', 2001, CAST(N'2022-08-30' AS Date), N'70000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (9, N'Cuộc sống không giới hạn', N'Chữa lành', 2014, CAST(N'2022-09-08' AS Date), N'80000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (10, N'To Kill a Mockingbird', N'Kinh điển', 1960, CAST(N'2022-10-18' AS Date), N'90000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (11, N'The Great Gatsby', N'Kinh điển', 1925, CAST(N'2022-11-27' AS Date), N'60000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (12, N'Pride and Prejudice', N'Tiểu thuyết', 1813, CAST(N'2022-12-05' AS Date), N'70000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (13, N'Crime and Punishment', N'Tiểu thuyết', 1866, CAST(N'2023-01-14' AS Date), N'100000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (14, N'1984', N'Chính tr?', 1949, CAST(N'2023-02-23' AS Date), N'120000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (15, N'The Lord of the Rings', N'Tiểu thuyết', 1954, CAST(N'2023-03-01' AS Date), N'80000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (16, N'The Catcher in the Rye', N'Tiểu thuyết', 1951, CAST(N'2023-04-10' AS Date), N'90000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (17, N'The Alchemist', N'Tiểu thuyết', 1988, CAST(N'2023-05-19' AS Date), N'110000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (18, N'Mắt biếc', N'Tình cảm', 1990, CAST(N'2023-06-25' AS Date), N'100000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (19, N'Doraemon', N'Phiêu lưu', 1969, CAST(N'2023-07-04' AS Date), N'80000')
INSERT [dbo].[book] ([id], [tensach], [theloai], [namxuatban], [ngaynhap], [giatien]) VALUES (20, N'One Hundred Years of Solitude', N'Kinh điển', 1967, CAST(N'2023-08-12' AS Date), N'90000')
SET IDENTITY_INSERT [dbo].[book] OFF
GO
SET IDENTITY_INSERT [dbo].[users] ON 

INSERT [dbo].[users] ([id], [taikhoan], [matkhau]) VALUES (1, N'admin', N'1')
INSERT [dbo].[users] ([id], [taikhoan], [matkhau]) VALUES (2, N'admin2', N'pass2')
INSERT [dbo].[users] ([id], [taikhoan], [matkhau]) VALUES (3, N'admin3', N'pass3')
INSERT [dbo].[users] ([id], [taikhoan], [matkhau]) VALUES (4, N'admin4', N'pass4')
INSERT [dbo].[users] ([id], [taikhoan], [matkhau]) VALUES (5, N'admin5', N'pass5')
SET IDENTITY_INSERT [dbo].[users] OFF
GO