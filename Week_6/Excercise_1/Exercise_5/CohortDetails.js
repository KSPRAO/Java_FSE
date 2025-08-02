import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ status }) => {
  return (
    <div className={styles.box}>
      <h3 style={{ color: status === 'ongoing' ? 'green' : 'blue' }}>
        Cohort Status: {status}
      </h3>
      <dl>
        <dt>Instructor</dt>
        <dd>Jane Doe</dd>
        <dt>Start Date</dt>
        <dd>2025-08-01</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
