import React from 'react';
import './../../../public/css/home.css';

interface YouTubePlayerProps {  
  videoId: string;
}

const YouTubePlayer: React.FC<YouTubePlayerProps> = ({ videoId }) => {
  return (
    <>
      <div className="videoContainer">
        <div className="video">  
          <iframe
            width="840"
            height="472.5"
            src={`https://www.youtube.com/embed/${videoId}`}
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope;picture-in-picture"
            allowFullScreen
          ></iframe>
        </div>
      </div>
    </>
  );
};

export default YouTubePlayer;