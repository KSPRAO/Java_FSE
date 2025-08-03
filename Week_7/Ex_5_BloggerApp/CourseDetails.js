import React from 'react';

const CourseDetails = () => {
  const courses = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/2022' },
  ];

  return (
    <div>
      <h1 className="text-2xl font-bold mb-4">Course Details</h1>
      {courses.map((course, index) => (
        <div key={index} className="mb-2">
          <h3 className="text-xl">{course.name}</h3>
          <p className="text-lg">Date: {course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;