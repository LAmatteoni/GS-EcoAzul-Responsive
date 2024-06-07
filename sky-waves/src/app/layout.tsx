import type { Metadata } from "next";
import { Poppins } from 'next/font/google'
import Header from './Header/header';
import Footer from './Footer/footer';
import Providers from "./providers";

export const metadata: Metadata = {
  title: "Sky Waves",
  description: "Generated by create next app",
};

const poppins = Poppins({
  weight: ['300', '400', '500', '600', '700', '800', '900',],
  style: ['normal', 'italic'],
  subsets: ['latin'],
  display: 'swap',
})

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="pt-BR">
      <head>
        <link rel="icon" href="/assets/logo.png" />
      </head>
      <body className={poppins.className}>
        <Header/>
        <Providers>{children}</Providers>
        <Footer/>
      </body>
    </html>
  );
}
