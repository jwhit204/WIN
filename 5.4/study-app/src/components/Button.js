const Button = ({color, text }) => {
    return (
    <button style={{backgroundColor: color}}
    className='btn'>
    {text}
    </button>
    )
}

// Register a change 

export default Button
