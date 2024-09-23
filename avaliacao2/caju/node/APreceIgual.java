/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class APreceIgual extends PPreceIgual
{
    private TIgual _igual_;

    public APreceIgual()
    {
        // Constructor
    }

    public APreceIgual(
        @SuppressWarnings("hiding") TIgual _igual_)
    {
        // Constructor
        setIgual(_igual_);

    }

    @Override
    public Object clone()
    {
        return new APreceIgual(
            cloneNode(this._igual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPreceIgual(this);
    }

    public TIgual getIgual()
    {
        return this._igual_;
    }

    public void setIgual(TIgual node)
    {
        if(this._igual_ != null)
        {
            this._igual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._igual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._igual_ == child)
        {
            this._igual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._igual_ == oldChild)
        {
            setIgual((TIgual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
